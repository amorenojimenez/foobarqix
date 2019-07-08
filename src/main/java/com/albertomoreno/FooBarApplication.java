package com.albertomoreno;

public class FooBarApplication {
    public static void main(String[] args) {
        FooBarGeneratorService service = new FooBarGeneratorService();
        service.generate(1, 100).stream().forEach(System.out::println);
    }
}
