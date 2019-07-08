package com.albertomoreno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

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
    public void generator_should_return_list_with_N_numbers() throws Exception {
        List<FooBarNumber> foos = service.generate(1, 100);
        assertNotNull(foos);
        assertEquals(100, foos.size());
    }
}
