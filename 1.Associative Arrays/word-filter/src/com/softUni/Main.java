package com.softUni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0 )
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
