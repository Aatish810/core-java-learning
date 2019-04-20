package com.aatish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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


        Employee john = new Employee("John Doe", 67);
        Employee tim = new Employee("Tim Buchkala", 45);
        Employee snow = new Employee("Snow White", 22);
        Employee jack = new Employee("Jack Hill", 34);

        Department hr = new Department("Human Resources");
        hr.addEmployees(jack);
        hr.addEmployees(tim);
        hr.addEmployees(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployees(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);


        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("---------------");
//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumber
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedGNumbers) {
            System.out.println(s);
        }
        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();

    }
}
