package org.example.Lesson_6_2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collegues.JavaDeveloper javaDev = new Collegues.JavaDeveloper("Tom");
        Collegues.AngularDeveloper angularDev = new Collegues.AngularDeveloper("Bill");
        Collegues.AutomationEngineer autoTester = new Collegues.AutomationEngineer("Misha", "Aksani");
        Collegues.ManualTestEngineer manualTester = new Collegues.ManualTestEngineer("John", "Smith");
        Collegues.Manager manager = new Collegues.Manager("William", "Underwood");

        manager.setTeamMembers(javaDev, angularDev, autoTester, manualTester);

        printInfo(javaDev);
        printInfo(angularDev);
        printInfo(autoTester);
        printInfo(manualTester);
        printInfo(manager);
    }

    private static void printInfo(Employee employee){
        System.out.println(employee.getInfo()+
               " is a " + employee.getSeniority() + " " + employee.getPosition());

    }


}



















