package com.company;

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;

        int mas[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }

        System.out.println();

        /*for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-5d", mas[i]);
            }
        }*/
        int sum = 0;
        int min, indexMin, max, indexMax;

        min = mas[0];
        max = mas[0];
        indexMax = 0;
        indexMin = 0;

        for (int i = 0; i < n; i++) {
            sum += mas[i];

            if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            }

            if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            }
        }

        System.out.println("Count: " + n);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + sum / (double) n);
        System.out.println("Min: " + min + " Index Min: " + indexMin);
        System.out.println("Max: " + max + " Index Max: " + indexMax);

        int sumChet = 0;
        int countChet = 0;
        for (int i = 0; i < n; i++) {
            if (mas[i] % 2 == 0) {
                sumChet += mas[i];
                countChet++;
            }
        }
    }
}
