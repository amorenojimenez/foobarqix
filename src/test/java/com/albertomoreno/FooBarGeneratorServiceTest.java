package com.albertomoreno;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FooBarGeneratorServiceTest {

    @Test
    public void should_write_numbers_from_1_to_100() throws Exception {
        FooBarGeneratorService service = new FooBarGeneratorService();
        List<Object> foos = service.generate(1, 100);

    }
}
