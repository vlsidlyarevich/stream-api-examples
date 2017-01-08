package com.github.vlsidlyarevich.stream.api.examples.creating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class СreationExample {

    public static void main(String[] args) {
        Stream emptyStream = Stream.empty();
        Stream stringStream = Stream.of("I want to be in stream");
        Stream collectionStream = (new ArrayList() {{
            add("Peter");
            add("Mike");
            add("Sally");
        }}).stream();
        Stream iterateStream = Stream.iterate(0, n -> n + 1).limit(2);
        Stream generatedStream = Stream.generate(Math::random).limit(5L);

        String sentence = "Java 8 Stream tutorial";
        Stream<String> regExpStream = Pattern.compile("\\w").splitAsStream(sentence);

        Stream buildedStream = Stream.builder()
                .add("Java 8")
                .add("Stream")
                .add("tutorial")
                .build();

        System.out.println("Empty stream: " + Arrays.toString(emptyStream.toArray()));
        System.out.println("Stream from string: " + Arrays.toString(stringStream.toArray()));
        System.out.println("Stream from collection: " + Arrays.toString(collectionStream.toArray()));
        System.out.println("Stream from iteration: " + Arrays.toString(iterateStream.toArray()));
        System.out.println("Stream from function: " + Arrays.toString(generatedStream.toArray()));
        System.out.println("Stream from regular expression: " + Arrays.toString(regExpStream.toArray()));
        System.out.println("Stream from stream builder: " + Arrays.toString(buildedStream.toArray()));
    }
}
