package com.github.vlsidlyarevich.stream.api.examples.third;

import java.util.stream.Stream;


public class Example03 {

    public static void main(String[] args) {
        Stream.iterate(1, n -> n * 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
