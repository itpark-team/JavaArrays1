package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        final int DELETE_VALUE = -1;

        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int n = 10;

        int mas[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            if (mas[i] == DELETE_VALUE) {
                continue;
            }
            //if(mas[i]!=DELETE_VALUE)
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();

        System.out.print("Введите индекс элемента для удаления: ");
        int deleteIndex = input.nextInt();

        mas[deleteIndex] = DELETE_VALUE;

        for (int i = 0; i < n; i++) {
            if (mas[i] == DELETE_VALUE) {
                continue;
            }
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();
    }
}
