package _30IO_NIO._7Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long SerialVersionUID = 1; // это поле используется для обозначения версии класса
    private String name;
    private String department;
    private int age;
    transient private double salary; //поля помеченные ключевым словом transient не сериализуются
    private Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
//Serializable - интерфейс метка(маркерный интерфейс), не содержит ничего, служит только для пометки класса. Чтобы объект
//можно было сериализировать, он должен быть помечен этим интерфейсом.