package com.aatish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Thread(() -> {
            System.out.println("Printing new Thread line 1");
            System.out.println("Printing new Thread line 2");
        }).start();


        Employee john = new Employee("John", 24);
        Employee tim = new Employee("Tim", 40);
        Employee jack = new Employee("Jack", 35);
        Employee snow = new Employee("Snow", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
