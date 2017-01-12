package com.github.vlsidlyarevich.stream.api.examples.third;

<<<<<<< Updated upstream
import java.util.stream.Stream;

=======

import java.util.stream.IntStream;
>>>>>>> Stashed changes

public class Example03 {

    public static void main(String[] args) {
<<<<<<< Updated upstream
        Stream.iterate(1, n -> n * 2)
                .limit(10)
                .forEach(System.out::println);
=======
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        int easySum = IntStream.range(0, 100)
                .sum();

        System.out.println("Sum with for-loop:" + sum);
        System.out.println("Sum with int stream:" + easySum);
>>>>>>> Stashed changes
    }
}
