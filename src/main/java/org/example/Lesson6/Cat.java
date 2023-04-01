package org.example.Lesson6;

public class Cat extends Animal {
    private String color;

    public Cat(String eats, int legs, boolean vegetarian, String color) {
        super(eats, legs, vegetarian);
        this.color = color;
    }

    public Cat(String eats, int legs, boolean vegetarian) {
        super(eats, legs, vegetarian);
        this.color = "blue";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}


