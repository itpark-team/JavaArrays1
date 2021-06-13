package com.company;

import java.util.Random;

public class Main5 {
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

        /*
        int temp = mas[0];

        mas[0] = mas[1];
        mas[1] = mas[2];
        mas[2] = temp;
        */

        /*int temp = mas[0];

        for (int i = 0; i < n - 1; i++) {
            mas[i] = mas[i + 1];
        }

        mas[n - 1] = temp;*/

        /*for (int i = 0; i < n; i++) {
            int temp = mas[i];
            int j = i;

            while (j > 0 && mas[j - 1] > temp) {
                mas[j] = mas[j - 1];
                j--;
            }

            mas[j] = temp;
        }*/

        int current;

        for (int i = 0; i < n; i++) {
            current = mas[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (current < mas[j]) {
                    mas[j + 1] = mas[j];
                } else {
                    break;
                }
            }
            mas[j + 1] = current;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }

    }
}
