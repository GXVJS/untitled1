package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean endsWith(String str, String suffix) {
        if (suffix.length() > str.length()) {
            return false;
        }
        return str.endsWith(suffix);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String suffix = scanner.nextLine();

        boolean result = endsWith(str, suffix);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
