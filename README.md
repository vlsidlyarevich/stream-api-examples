# Stream-API-Examples
Useful features, and examples of Java's 8 Stream API

###Ways to create stream
I've decided to group ways of creating Stream's in one simple class called `StreamCreator.java`.
Of course, you don't need to take away Stream creation logic into separate class, it was done just for readability and simple navigation.

#### Empty stream
There is a posibility to create empty sequential stream. Stream's emptyness means that there is no elements in it.

[StreamCreator.java](https://github.com/vlsidlyarevich/Stream-API-Examples/blob/master/src/main/java/com/github/vlsidlyarevich/stream/api/examples/creating/StreamCreator.java#L11)
```java
return Stream.empty();
```

#### From object

#### From Collection

#### From Array

#### From another API's

#### From iterating

#### From generating

---

###Stream's properties

####Non interfering
Stream can not modify or mutate it's source. For example in [Class]() stream will not add new values to collection.

####Streams are stateless
Streams aren't depends on outer conditions. 

---