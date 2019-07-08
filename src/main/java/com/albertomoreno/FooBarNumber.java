package com.albertomoreno;

import com.google.common.collect.ImmutableMap;

import java.io.StringWriter;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FooBarNumber {

    private final static String FOO = "Foo";
    private final static String BAR = "Bar";
    private final static String QIX = "QIX";
    private final static Map<String, String> convert = ImmutableMap.of(
            "3", "Foo",
            "5", "Bar",
            "7", "Qix");


    private final int value;

    private FooBarNumber(int value) {
        this.value = value;
    }

    public static FooBarNumber valueOf(int value) {
        return new FooBarNumber(value);
    }

    private String translateDigits() {
        return Integer.valueOf(value).toString().chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(s -> convert.getOrDefault(s, ""))
                .collect( Collectors.joining( ""));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FooBarNumber that = (FooBarNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) sb.append(FOO);
        if (value % 5 == 0) sb.append(BAR);
        sb.append(translateDigits());

        return (sb.length() > 0) ? sb.toString() : String.format("%d", value);
    }
}
