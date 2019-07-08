package com.albertomoreno;

import java.io.StringWriter;
import java.util.Objects;
import java.util.StringJoiner;

public class FooBarNumber {

    private final static String FOO = "Foo";
    private final static String BAR = "Bar";

    private final int value;

    private FooBarNumber(int value) {
        this.value = value;
    }

    public static FooBarNumber valueOf(int value) {
        return new FooBarNumber(value);
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

        return (sb.length() > 0) ? sb.toString() : String.format("%d", value);
    }
}
