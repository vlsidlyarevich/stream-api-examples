package com.github.vlsidlyarevich.stream.api.examples;

import com.github.vlsidlyarevich.stream.api.examples.creating.StreamCreator;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Application {

    public static void main(String[] args) {
        StreamCreator streamCreator = new StreamCreator();

        Stream emptyStream = streamCreator.empty();
        Stream stringStream = streamCreator.fromObject("I want to be in stream");
        Stream collectionStream = streamCreator.fromCollection(new ArrayList() {{
            add("Peter");
            add("Mike");
            add("Sally");
        }});
        Stream iterateStream = streamCreator.fromIterate();
        Stream generatedStream = streamCreator.fromGenerate(Math::random, 5L);


    }
}
