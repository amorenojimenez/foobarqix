package com.albertomoreno;

import java.util.Objects;
import java.util.StringJoiner;

public class FooBarNumber {

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
        return String.format("%d", value);
    }
}
