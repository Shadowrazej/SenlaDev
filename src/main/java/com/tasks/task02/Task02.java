package com.tasks.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и НОД (наибольший общий делитель)
двух целых чисел, введенных пользователем. Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2");

        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println("Greatest common divisor: " + getGreatestCommonDivisor(number1, number2));
            System.out.println("Least common multiple: " + getLeastCommonMultiple(number1, number2));
        } catch (InputMismatchException e) {
            System.out.println("Wrong number");
        }

        scanner.close();
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1 + num2;
    }

    public static int getLeastCommonMultiple(int num1, int num2) {
        int result = 0;
        try {
            result = num1 * num2 / getGreatestCommonDivisor(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Div by zero");
        }
        return result;
    }
}
