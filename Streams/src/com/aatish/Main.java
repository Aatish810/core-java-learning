package com.aatish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumber = Arrays.asList(
                "N40", "N36",
                "G10", "G39", "G40", "G29",
                "I26", "I53",
                "O71"
        );

        List<String> gNumbers = new ArrayList<>();

        // Finding Numbers without Streams
        someBingoNumber.forEach(num -> {
            if(num.toUpperCase().startsWith("G")) {
                gNumbers.add(num);
            }
        });

        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
        gNumbers.forEach((s) -> System.out.println(s));

        System.out.println("Testing Streams in JAVA8");
        // Using Stream in Java 8
        someBingoNumber.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        // Other Functions of Streams
        Stream<String> inNumbers = Stream.of("I20", "I30", "I78", "I98");
        Stream<String> ioNumbers = Stream.of("I20", "I30", "IO71", "IO23","IO45");

        Stream<String> concatStream = Stream.concat(ioNumbers, inNumbers);

        System.out.println(concatStream.distinct()
        .peek(System.out::println).count());
    }
}
