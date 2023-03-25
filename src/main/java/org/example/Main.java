package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum = 0;
        Random rand= new Random();
        for (int a = 0; a < arr.length; a++) {
            arr[a] = rand.nextInt(50);
            if (arr[a] > 5 && arr[a] < 45) {
                sum += arr[a];
            }
            System.out.println(arr[a]);
        }
        System.out.println("5<Summ of number< 45 =" + sum);
                System.out.print("Even positive nombers: ");
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > 0 && arr[a] % 2 == 0) {
                System.out.print(arr[a] + " ");
            }
        }

    }
}