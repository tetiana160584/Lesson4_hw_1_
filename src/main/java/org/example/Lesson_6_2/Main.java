package org.example.Lesson_6_2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collegues collegues = new Collegues();
        Employee[] team = new Employee[4];
        team[0] = collegues.new JavaDeveloper("Tom");
        team[1] = collegues.new AngularDeveloper("Bill");
        team[2] = collegues.new AutomationEngineer("Misha", "Aksani");
        team[3] = collegues.new ManualTestEngineer("John", "Smith");
        Collegues.Manager manager = collegues.new Manager("William", "Underwood");
        manager.setTeamMembers(team);
        System.out.println(team[0].getInfo());
        System.out.println(team[1].getInfo());
        System.out.println(team[2].getInfo());
        System.out.println(team[3].getInfo());
        System.out.println(manager.getName() + " " + manager.getLastName() +
                " is a " + manager.getSeniority() + " " + manager.getPosition() +
                " and has a team of 4 members: " + Arrays.toString(team));
    }
}

















