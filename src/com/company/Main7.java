package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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

        System.out.print("Введите индекс элемента: ");
        int updateIndex = input.nextInt();

        System.out.print("Введите значение элемента: ");
        int updateValue = input.nextInt();

        mas[updateIndex] = updateValue;
        System.out.println(mas[updateIndex]);

        int x = mas[updateIndex];

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();
    }
}
