package com.albertomoreno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class FooBarNumberTest {

    @ParameterizedTest(name = "{index}) number={0}, expected toString={1}")
    @CsvSource({
            "1, 1",
            "1, 1",
            "1, 1",
            "1, 1",
            "1, 1",
            "1, 1",
            "1, 1",
            "1, 1"
    })
    public void number_should_translate_to_foobar(int number, String expectedFooBarText) {
        FooBarNumber fooBar = FooBarNumber.valueOf(number);
        Assertions.assertEquals(expectedFooBarText, fooBar.toString());
    }
}
