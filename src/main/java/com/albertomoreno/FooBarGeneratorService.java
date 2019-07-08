package com.albertomoreno;

import java.io.BufferedWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FooBarGeneratorService {


    public List<FooBarNumber> generate(int fromInclusive, int toInclusive) {
        if (fromInclusive > toInclusive)
            throw new IllegalArgumentException("Le chiffre de départ ne peut pas être supérieur que le chiffre de destination");

        return IntStream.range(fromInclusive, toInclusive + 1).mapToObj(i -> FooBarNumber.valueOf(i)).collect(Collectors.toList());
    }
}
