package com.albertomoreno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class FooBarNumberTest {

    private final static String FOO = "Foo";
    private final static String BAR = "Bar";

    @ParameterizedTest(name = "{index}) number={0}, expected toString={1}")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, FooFoo",
            "4, 4",
            "5, BarBar",
            "6, Foo",
            "7, Qix",
            "8, 8",
            "9, Foo",
            "10, Bar"
    })
    public void number_should_translate_to_foobar(int number, String expectedFooBarText) {
        FooBarNumber fooBar = FooBarNumber.valueOf(number);
        Assertions.assertEquals(expectedFooBarText, fooBar.toString());
    }

    @Test
    public void multiplesx3_should_begin_by_foo() {
        for (int i = 1; i < 100; i++) {
            FooBarNumber fooBar = FooBarNumber.valueOf(i * 3);
            assertThat(fooBar.toString(), startsWith(FOO));
        }
    }

    @Test
    public void multiplesx5_should_contain_bar() {
        for (int i = 1; i < 100; i++) {
            FooBarNumber fooBar = FooBarNumber.valueOf(i * 5);
            assertThat(fooBar.toString(), containsString(BAR));
        }
    }
}
