package com.albertomoreno;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

public class FooBarGeneratorServiceTest {

    FooBarGeneratorService service;

    @BeforeEach
    public void init() {
         service = new FooBarGeneratorService();
    }

    @Test
    public void generator_should_verify_from_lower_than_to() throws Exception {
        assertThrows(IllegalArgumentException.class,
                () -> service.generate(100, 1));
    }

    @Test
    public void generator_should_return_list_with_all_numbers_in_requested_interval() throws Exception {
        List<FooBarNumber> foos = service.generate(1, 100);
        assertNotNull(foos);
        assertThat(foos, hasSize(100));

        for (int i = 1; i <= 100; i++) {
            assertThat(foos, hasItem(FooBarNumber.valueOf(i)));
        }
    }
}
