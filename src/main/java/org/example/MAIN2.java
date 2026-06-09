package org.example;

import java.util.Scanner;

public class MAIN2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Находим индекс максимального элемента
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nМаксимальный элемент: " + array[maxIndex] + " (индекс: " + maxIndex + ")");

        // Массив слева от максимума
        int[] left = new int[maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            left[i] = array[i];
        }

        // Массив справа от максимума
        int[] right = new int[n - maxIndex - 1];
        for (int i = maxIndex + 1; i < n; i++) {
            right[i - maxIndex - 1] = array[i];
        }

        // Вывод результатов
        System.out.print("Числа слева от максимума:  ");
        if (left.length == 0) {
            System.out.println("(пусто — максимум стоит первым)");
        } else {
            for (int num : left) System.out.print(num + " ");
            System.out.println();
        }

        System.out.print("Числа справа от максимума: ");
        if (right.length == 0) {
            System.out.println("(пусто — максимум стоит последним)");
        } else {
            for (int num : right) System.out.print(num + " ");
            System.out.println();
        }

        scanner.close();
    }
}
