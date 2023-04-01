package org.example.Lesson5;

import java.util.Scanner;

public class Calcul2 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int number=scanner.nextInt(), number2;
        System.out.println("Enter second number");
        number2=scanner.nextInt();
        if (number2==0){
            System.out.println("You can't divide by zero!");
            return;
        };
        System.out.println("Enter symbol of operation");
        char symbol=scanner.next().charAt(0);
        int result =0;
        System.out.println("sum is:"+sum(number, number2)); 
        System.out.println("subtr is:"+subtr (number, number2));
        System.out.println("divide is:" +divide(number, number2));
        System.out.println("multiply is:" +multiply(number, number2) );
        System.out.println("perc is:" +perc(number, number2));
        return;

    }

    public static int sum(int a, int b){
        return a+b;
    };

    public static int subtr(int a, int b){
        return a-b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int perc(int a, int b){
        return a*b/100;
    }

}
