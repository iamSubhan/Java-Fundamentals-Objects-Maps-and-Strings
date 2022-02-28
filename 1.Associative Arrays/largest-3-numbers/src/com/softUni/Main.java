package com.softUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .sorted((n1,n2) -> n2.compareTo(n1))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
