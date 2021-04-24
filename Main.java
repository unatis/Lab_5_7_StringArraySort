package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Words[] = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any 5 words.");

        for(int i = 0; i < Words.length; i++){

            Words[i] = scanner.nextLine();

        }

        Arrays.sort(Words);

        for(int i = 0; i < Words.length; i++){

            System.out.println(Words[i]);

        }

        System.out.println("The End");

    }
}

