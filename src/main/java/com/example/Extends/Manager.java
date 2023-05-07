package com.example.Extends;

import lombok.Data;

@Data
public class Manager extends Employee {
    private double bonus;

    public static final double MAX_BONUS = 35_000.0;


    @Override
    public double getSalary() {
        if (getBonus() > MAX_BONUS) {
          return super.getSalary();
        }
        return super.getSalary() + getBonus();
    }

    public String toString() {
        return "Information about Kseniya: ".concat(super.getName())
                .concat(" - ").concat(String.valueOf(getBonus()))
                .concat(" - ").concat(String.valueOf(super.getSalary()));
    }
}
