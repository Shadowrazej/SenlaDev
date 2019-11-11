package com.tasks.task04;

import java.util.Scanner;

/*
Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
 */

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        System.out.println("Enter the word");
        String word = scanner.nextLine();
        printWordCounter(sentence, word);
    }

    public static void printWordCounter(String sentence, String word) {
        String[] arraySentence = sentence.toLowerCase().split(" ");
        word = word.toLowerCase().trim();
        int counter = 0;
        for (String words : arraySentence) {
            if (word.equals(words)) {
                counter++;
            }
        }
        System.out.println("Counter: " + counter);
    }
}
