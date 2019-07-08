package com.albertomoreno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FooBarGeneratorServiceTest {

    FooBarGeneratorService service;

    @BeforeEach
    public void init() {
         service = new FooBarGeneratorService();
    }

    @Test
    public void generator_should_verify_from_lower_than_to() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> service.generate(100, 1));
    }

    @Test
    public void generator_should_return_list() throws Exception {
        List<Object> foos = service.generate(1, 100);
        Assertions.assertNotNull(foos);
    }
}
