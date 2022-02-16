package com.softUni;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //Using a TreeMap as require ascending order
        TreeMap<Integer, Integer> counts = new TreeMap<>();
        for (int num : numbers) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }
        for (Map.Entry<Integer, Integer> count : counts.entrySet()) {
            System.out.printf("%d -> %d%n", count.getKey(),count.getValue());
        }

    }
}
