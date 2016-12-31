package com.github.vlsidlyarevich.stream.api.examples.creating;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class StreamCreator {

    public Stream empty() {
        return Stream.empty();
    }

    public Stream fromObject(Object obj) {
        return Stream.of(obj);
    }

    public Stream fromCollection(Collection collection) {
        return collection.stream();
    }

    public Stream fromIterate() {
        return Stream.iterate(0, n -> n + 1).limit(2);
    }

    public Stream fromGenerate(Supplier supplier, Long maxSize) {
        return Stream.generate(supplier).limit(maxSize);
    }
}
