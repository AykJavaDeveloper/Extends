package com.example.Extends;

import lombok.Data;

@Data
public class JavaDeveloper extends Employee {

    private double petProject;

    @Override
    public double getSalary() {
        return super.getSalary() + getPetProject();
    }
}
