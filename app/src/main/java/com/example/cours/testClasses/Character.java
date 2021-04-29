package com.example.cours.testClasses;

import java.io.Serializable;

public class Character implements Serializable {
    public String name;

    public int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void shoutName() {
        System.out.println("My name is " + this.name + "!");
    }
}
