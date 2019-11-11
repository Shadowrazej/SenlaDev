package com.tasks.task03;

import java.util.Arrays;
import java.util.Scanner;

/*
Создать программу, которая будет:
 - подсчитывать количество слов в предложении;
 - выводить их в отсортированном виде;
 - делать первую букву каждого слова заглавной.
Предложение вводится вручную. (Разделитель пробел (“ ”)).
 */

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        printSentenceInfo(scanner.nextLine());
        scanner.close();
    }

    public static void printSentenceInfo(String sentence) {
        String[] arraySentence = sentence.toLowerCase().split(" ");
        Arrays.sort(arraySentence);
        System.out.println("Sorted words: ");
        for (int i = 0; i < arraySentence.length; i++) {
            arraySentence[i] = arraySentence[i].substring(0, 1).toUpperCase() + arraySentence[i].substring(1);
            System.out.println(arraySentence[i]);
        }
        System.out.println("Count: " + arraySentence.length);
    }
}
