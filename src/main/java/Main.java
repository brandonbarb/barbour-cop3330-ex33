/*
 *  UCF COP3330 Summer 2021 Assignment 33 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] answers = {"Yes", "No", "Maybe", "Ask again later."};
        Random number = new Random();
        System.out.print("What's your question?\n> ");
        Scanner input = new Scanner(System.in);
        String question = input.next();

        int i = number.nextInt(4);
        System.out.printf("%s", answers[i]);
    }
}
