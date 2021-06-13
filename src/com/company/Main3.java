package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int N = 10;
        int weightsCollection[] = new int[N];

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            weightsCollection[i] = random.nextInt(100);
        }

        System.out.println("Веса людей не отсортированные: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-5d", weightsCollection[i]);
        }
        System.out.println();

        int temp;
        int offset = 0;
        boolean isSort;

        do {
            isSort = true;

            for (int i = 0; i < N - 1 - offset; i++) {
                if (weightsCollection[i + 1] < weightsCollection[i]) {
                    isSort = false;

                    temp = weightsCollection[i];
                    weightsCollection[i] = weightsCollection[i + 1];
                    weightsCollection[i + 1] = temp;
                }
            }

            offset++;
        } while (isSort == false);

        System.out.println("Веса людей отсортированные: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-5d", weightsCollection[i]);
        }
        System.out.println();

        System.out.print("Введите вес для поиска: ");
        int searchWeight = input.nextInt();
        int searchIndex = -1;

        int leftIndex = 0;
        int rightIndex = N - 1;
        int middleIndex;

        if (searchWeight == weightsCollection[0]) {
            searchIndex = 0;
        } else if (searchWeight == weightsCollection[N - 1]) {
            searchIndex = N - 1;
        } else {
            while (rightIndex - leftIndex > 1) {
                middleIndex = (leftIndex + rightIndex) / 2;

                if (weightsCollection[middleIndex] == searchWeight) {
                    searchIndex = middleIndex;
                    break;
                } else if (weightsCollection[middleIndex] < searchWeight) {
                    leftIndex = middleIndex;
                } else if (weightsCollection[middleIndex] > searchWeight) {
                    rightIndex = middleIndex;
                }
            }
        }

        System.out.printf("Первый человек с весом %d имеет индекс: %d", searchWeight, searchIndex);

        /*System.out.print("Введите вес для поиска: ");
        int searchWeight = input.nextInt();
        int searchIndex = -1;

        for (int i = 0; i < N; i++) {
            if (weightsCollection[i] == searchWeight) {
                searchIndex = i;
                break;
            }
        }
        System.out.printf("Первый человек с весом %d имеет индекс: %d", searchWeight, searchIndex);*/

    }
}
