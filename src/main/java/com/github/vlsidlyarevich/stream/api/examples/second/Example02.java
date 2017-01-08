package com.github.vlsidlyarevich.stream.api.examples.second;

import java.util.*;
import java.util.stream.Stream;


public class Example02 {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        Stream<String> arrListStream = arrList.stream();  //sized, ordered

        List<String> linkedList = new LinkedList<>();
        Stream<String> linkedListStream = linkedList.stream();  //sized, ordered

        Set<String> hashSet = new HashSet<>();
        Stream<String> hashSetStream = hashSet.stream();  //sized, distinct

        Set<String> linkedHashSet = new LinkedHashSet<>();
        Stream<String> linkedHashSetStream = linkedHashSet.stream();  //sized, distinct, ordered

        Set<String> treeSet = new TreeSet<>();
        Stream<String> treeSetStream = treeSet.stream();  //sized, distinct, sorted, ordered
    }
}
