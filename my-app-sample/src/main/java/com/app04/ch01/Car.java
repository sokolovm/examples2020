package com.app04.ch01;

public class Car {

    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Car() {

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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
