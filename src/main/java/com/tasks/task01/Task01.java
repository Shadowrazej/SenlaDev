package com.tasks.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным,
простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        try {
            int number = scanner.nextInt();
            printEvenOrOdd(number);
            printSimpleOrComplex(number);
        } catch (InputMismatchException e) {
            System.out.println("Wrong number");
        }

        scanner.close();
    }

   public static void printEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("It's even number");
        } else {
            System.out.println("It's odd number");
        }
    }

    public static void printSimpleOrComplex(int number) {
        if (number < 2) {
            System.out.println("It is not simple number");
            System.out.println("It is not complex number");
            return;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println("It's complex number");
                return;
            }
        }
        System.out.println("It's simple number");
    }
}
