# Java 8 Stream API Examples
Useful features, and examples of Java's 8 Stream API

---

## What is stream?

Stream represents a sequence of objects from a source, which supports aggregate operations. Following are the characteristics of a Stream −

* **Sequence of elements** − A stream provides a set of elements of specific type in a sequential manner. A stream gets/computes elements on demand. It never stores the elements.

* **Source** − Stream takes Collections, Arrays, or I/O resources as input source.

* **Aggregate operations** − Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.

* **Pipelining** − Most of the stream operations return stream itself so that their result can be pipelined. These operations are called intermediate operations and their function is to take input, process them, and return output to the target. collect() method is a terminal operation which is normally present at the end of the pipelining operation to mark the end of the stream.

* **Automatic iterations** − Stream operations do the iterations internally over the source elements provided, in contrast to Collections where explicit iteration is required.

---

## Stream's properties

#### Non interfering
Stream can not modify or mutate it's source. For example in [Class]() stream will not add new values to collection.

#### Streams are stateless
Streams aren't depends on outer conditions. 

---

## Ways to create stream
Look for [CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/CreationExample.java) for examples of creation Streams.

#### Empty stream
There is a posibility to create empty sequential stream. Stream's emptyness means that there is no elements in it.

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L12)
```java
Stream.empty();
```

#### From object
There is a posibility to create empty sequential stream. Stream's emptyness means that there is no elements in it.

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L13)
```java
Stream.of(obj);
```


#### From Collection
You can create stream from collection, sequential it or not depends on type of collection.

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L14-L18)
```java
collection.stream();
```

#### From another API's
It is possible to create streams from popular Java API's like for example regular expressions:

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L22-L23)
```java
String sentence = "Java 8 Stream tutorial";
Stream<String> regExpStream = Pattern.compile("\\w").splitAsStream(sentence);
```

#### From iterating
In the example below, we use Stream.iterate which allows us to call infinite streams, a stream with out a fixed size. 

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L19)
```java
Stream.iterate(0, n -> n + 1).limit(2);
```

#### From generating
Stream.generate allows you to produce an infinite stream of values on demand. The code below will generate a stream of 5 random double numbers from 0 to 1 and we apply the limit otherwise the stream would be unbounded.

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L20)
```java
Stream generatedStream = Stream.generate(Math::random).limit(5L);
```

#### From builder
Stream.builder can create a stream of values that are added

[CreationExample.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/%D0%A1reationExample.java#L25-29)
```java
Stream buildedStream = Stream.builder()
            .add("Java 8")
            .add("Stream")
            .add("tutorial")
            .build();
```

---
## Stream operations
There is three types of operations in streams:
* Intermediate operations (distinct,filter,map,flatMap,peek,sorted,limit,skip,unordered,parallel,sequential)
* Terminal operations (allMatch,anyMatch,noneMatch,findAny,findFirst,forEach,iterator,reduce,collect)
Difference is that
* Short-circuiting (find*,*Match,limit) e.g. 5 terminal commands-all match and find, and one limit command

### Intermidiate operations

#### distinct
`Stream<T> distinct();`

Marks Stream as distinct. All elements are distinct.

#### filter
`Stream<T> filter(Predicate<? super T> predicate);`

Creates stream with all elements according to given ``Predicate<S>``.

#### map
`<R> Stream<R> map(Function<? super T, ? extends R> mapper);`

Applies function from type S to type T for every element of stream.

#### flatMap
`<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);`

Converts stream with nested Data like `Stream<String[]>` to Stream without nesting, e.g. `Stream<String>`.

#### peek
`Stream<T> peek(Consumer<? super T> action);`

Useful for Streams debugging, allows to look what data in some moments is processing.

#### sorted
`Stream<T> sorted();`
`Stream<T> sorted(Comparator<? super T> comparator);`

Marks Stream as sorted. It becomes sorted.

#### limit
`Stream<T> limit(long maxSize);`

Limit Stream to given size.

#### skip
`Stream<T> skip(long n);`

Skip first nth elements of the Stream.

#### unordered
`Stream<S> s.unordered();`

Marks Stream as unordered. It becomes unordered.

#### parallel
`Stream<S> s.parallel();`

All future operations are multi-threaded.

#### sequential
`Stream<S> s.sequential();`

Marks Stream as sequential. All future operations are in single thread.

---

### Terminal operations

#### forEach
`void forEach(Consumer<? super T> action);`

Performs an given action `Consumer<S>` for each element of the stream.

#### toArray
`Object[] toArray();`

Returns an array with elements of this stream.

#### reduce
`T reduce(T identity, BinaryOperator<T> accumulator);`
`Optional<T> reduce(BinaryOperator<T> accumulator);`
`<U> U reduce(U identity,BiFunction<U, ? super T, U> accumulator,BinaryOperator<U> combiner);`

Combines stream elements into one using `BinaryOperator<Type>`.

#### collect
`<R> R collect(Supplier<R> supplier,BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner);`
`<R, A> R collect(Collector<? super T, A, R> collector);`

Collects elements of stream into another container.

#### min
`Optional<T> min(Comparator<? super T> comparator);`

Performs an given action `Consumer<S>` for each element of the stream.

#### max
`Optional<T> max(Comparator<? super T> comparator);`

Performs an given action `Consumer<S>` for each element of the stream.

#### count
`long count();`

Performs an given action `Consumer<S>` for each element of the stream.

#### anymatch
`boolean anyMatch(Predicate<? super T> predicate);`

Performs an given action `Consumer<S>` for each element of the stream.

#### allMatch
`boolean allMatch(Predicate<? super T> predicate);`

Performs an given action `Consumer<S>` for each element of the stream.

#### noneMatch
`boolean noneMatch(Predicate<? super T> predicate);`

Performs an given action `Consumer<S>` for each element of the stream.

#### findFirst
`Optional<T> findFirst();`

Performs an given action `Consumer<S>` for each element of the stream.

#### findAny
`Optional<T> findAny();`

Performs an given action `Consumer<S>` for each element of the stream.

---
