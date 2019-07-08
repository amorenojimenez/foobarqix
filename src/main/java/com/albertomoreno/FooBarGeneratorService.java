package com.albertomoreno;

import java.io.BufferedWriter;
import java.util.Collections;
import java.util.List;

public class FooBarGeneratorService {


    public List<Object> generate(int fromInclusive, int toInclusive) {
        if (fromInclusive > toInclusive)
            throw new IllegalArgumentException("Le chiffre de départ ne peut pas être supérieur que le chiffre de destination");

        return Collections.emptyList();
    }
}
