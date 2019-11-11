package com.tasks.task05;

import java.util.Scanner;

/*
Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы (зеркальное значение равно оригинальному).
Длина последовательности N вводится вручную и не должна превышать 100.
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int count = scanner.nextInt();
        printPalindromeNumbers(count);
    }

    public static boolean isPalindrome(String number) {
        StringBuilder reverse = new StringBuilder(number).reverse();
        String stringReverse = reverse.toString();
        return number.equalsIgnoreCase(stringReverse);
    }

    public static void printPalindromeNumbers(int count) {
        if (count < 0 || count > 100) {
            return;
        }
        for (int i = 0; i < count; i++) {
            if (isPalindrome(String.valueOf(i))) {
                System.out.println(i);
            }
        }
    }
}
