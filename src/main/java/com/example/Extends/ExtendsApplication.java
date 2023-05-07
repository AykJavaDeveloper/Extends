package com.example.Extends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ExtendsApplication {

    public static void main(String[] args) {
        Employee employeeGalina = new Employee();
        employeeGalina.setName("Galina");
        employeeGalina.setSalary(17_000.0);

        Manager kseniya = new Manager();
        kseniya.setName("Kseniya");
        kseniya.setSalary(30_000.0);
        kseniya.setBonus(35_000.0);

        System.out.println(kseniya);
    }
}
