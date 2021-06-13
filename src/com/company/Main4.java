package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int n = 10;

        int weightsCollection[] = new int[n];

        for (int i = 0; i < n; i++) {
            weightsCollection[i] = random.nextInt(100);
        }
        System.out.println("Веса людей не отсортированные: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", weightsCollection[i]);
        }

        System.out.println();

        int min;
        int minIndex;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            min = weightsCollection[i];
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (weightsCollection[j] < min) {
                    minIndex = j;
                    min = weightsCollection[minIndex];
                }
            }
            temp = weightsCollection[minIndex];
            weightsCollection[minIndex] = weightsCollection[i];
            weightsCollection[i] = temp;
        }

        System.out.println("Веса людей отсортированные: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", weightsCollection[i]);
        }
        System.out.println();

        System.out.print("Введите вес для поиска: ");
        int searchWeight = input.nextInt();
        int searchIndex = -1;

        int leftIdex = 0;
        int rightIndex = n - 1;
        int middleIdex;

        while (rightIndex - leftIdex > 1) {

            middleIdex = (leftIdex + rightIndex) / 2;
            if (weightsCollection[middleIdex] == searchWeight) {
                searchIndex = middleIdex;
                break;
            } else if (weightsCollection[middleIdex] < searchWeight) {
                leftIdex = middleIdex;
            } else if (weightsCollection[middleIdex] > searchWeight) {
                rightIndex = middleIdex;
            }
        }


        System.out.printf("Первый человек с весом %d имеет индекс: %d", searchWeight, searchIndex);
    }
}