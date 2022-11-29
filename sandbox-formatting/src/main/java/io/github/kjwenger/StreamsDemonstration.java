package io.github.kjwenger;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsDemonstration {
  public static void main(String[] args) {System.out.println("IntStream of 1 - 10");
    IntStream.rangeClosed(1, 10).forEach(System.out::println);
    System.out.println("LongStream of 1 - 10");

    LongStream.rangeClosed(1,10).forEach(System.out::println);
  }
}