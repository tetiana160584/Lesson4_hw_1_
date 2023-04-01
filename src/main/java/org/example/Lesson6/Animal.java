package org.example.Lesson6;

public class Animal {
    private String  eats;
    private int legs;
    private boolean vegetarian;

    public Animal(String eats, int legs, boolean vegetarian) {
        this.eats = eats;
        this.legs = legs;
        this.vegetarian = vegetarian;
    }

    public Animal() {
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}



