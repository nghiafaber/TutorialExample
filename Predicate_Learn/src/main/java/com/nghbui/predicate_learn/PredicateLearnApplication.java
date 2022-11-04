package com.nghbui.predicate_learn;

import com.nghbui.predicate_learn.entities.Employee;
import com.nghbui.predicate_learn.entities.Gender;
import com.nghbui.predicate_learn.entities.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class PredicateLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredicateLearnApplication.class, args);

        Predicate<Employee> maleAndAgeGreaterThan25 = (employee) -> employee.getAge() > 25 && employee.getGender() == Gender.MALE;
        Predicate<Employee> femaleAndManager = (employee) -> employee.getRole() == Role.MANAGER && employee.getGender() == Gender.FEMALE;
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("1", "Tony Stark", 23, Gender.MALE, Role.EMPLOYEE, 25000));
        employees.add(new Employee("2", "Steve Rogers", 28, Gender.MALE, Role.MANAGER, 35000));
        employees.add(new Employee("3", "Natasha Romanoff", 23, Gender.FEMALE, Role.MANAGER, 30000));
        employees.add(new Employee("4", "Wanda Maximoff", 25, Gender.FEMALE, Role.SENIOR_MANAGER, 50000));

        System.out.println("Male and age greater than 25");
        employees.stream()
                .filter(maleAndAgeGreaterThan25)
                .forEach(employee -> System.out.println(employee.toString()));

        System.out.println("\nFemale and Manager");
        employees.stream()
                .filter(femaleAndManager)
                .forEach(employee -> System.out.println(employee.toString()));

    }

}
