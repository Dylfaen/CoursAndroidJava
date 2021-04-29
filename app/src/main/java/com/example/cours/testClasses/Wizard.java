package com.example.cours.testClasses;

import java.io.Serializable;

public class Wizard extends Character {

    public String spell;

    public Wizard(String name, int age, String spell) {
        super(name, age);
        this.spell = spell;
    }

    public void castSpell() {
        System.out.println("I cast " + this.spell + "!");
    }
}
