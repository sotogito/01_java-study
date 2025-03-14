package com.ibe6.Practice1.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee(){}

    public Employee(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + super.getAge() +
                ", height=" + super.getHeight() +
                ", weight=" + super.getWeight() +
                ", salary=" + salary +
                ", dept='" + dept;
    }

}
