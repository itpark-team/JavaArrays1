package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        int mas[] = new int[N];

        int sum, min, max;
        double avg;

        int indexMin, indexMax;

        int temp;

        Random random = new Random();

        for (int i = 0; i < N; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(mas[i] + " ");
        }

        min = mas[0];
        indexMin = 0;
        for (int i = 0; i < N; i++) {
            if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            }
        }

        max = mas[0];
        indexMax = 0;
        for (int i = 0; i < N; i++) {
            if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            }
        }

        sum = 0;
        for (int i = 0; i < N; i++) {
            sum += mas[i];
        }

        avg = sum / (double) N;

        System.out.println();
        System.out.println("min = " + min);
        System.out.println("indexMin = " + indexMin);
        System.out.println("max = " + max);
        System.out.println("indexMax = " + indexMax);
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);

        temp = mas[indexMin];
        mas[indexMin] = mas[indexMax];
        mas[indexMax] = temp;

        for (int i = 0; i < N; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
