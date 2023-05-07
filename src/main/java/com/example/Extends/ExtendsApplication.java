package com.example.Extends;
public class ExtendsApplication {

    public static void main(String[] args) {
        Employee employeeGalina = new Employee();
        employeeGalina.setName("Galina");
        employeeGalina.setSalary(17_000.0);

        Manager kseniya = new Manager();
        kseniya.setName("Kseniya");
        kseniya.setBonus(35_000.0);
        kseniya.setSalary(30_000.0);

        JavaDeveloper aik = new JavaDeveloper();
        aik.setName("Aik");
        aik.setPetProject(170_000.0);
        aik.setSalary(100_000.0);


        System.out.println(aik.getSalary());
    }
}
