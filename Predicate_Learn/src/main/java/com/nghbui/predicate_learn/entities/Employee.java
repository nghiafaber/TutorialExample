package com.nghbui.predicate_learn.entities;

public class Employee {
    private final String id;
    private final String name;
    private final int age;
    private final Gender gender;
    private final Role role;
    private final double salary;

    public Employee(String id, String name, int age, Gender gender, Role role, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s, Age: %d, Gender: %s, Role: %s",
                this.id, this.name, this.age, this.gender, this.role);
    }
}

