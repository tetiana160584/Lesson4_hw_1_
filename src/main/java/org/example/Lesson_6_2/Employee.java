package org.example.Lesson_6_2;

public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String LastName;

    public String getLastName() {
        return LastName;
    }

    public abstract String getPosition();

    public abstract String getSeniority();

    public String getInfo() {

       return getName();

}

    @Override
    public String toString() {
        return getName();
    }
}
