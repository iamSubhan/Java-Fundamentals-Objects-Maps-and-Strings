package com.softUni;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();

        //use a linkedHashMap to store each char count
        Map<Character, Integer> count = new LinkedHashMap<>();
        
        for (char ch: chars) {
            count.putIfAbsent(ch, 0);
            count.put(ch, count.get(ch) + 1);
        }

        for (Map.Entry<Character, Integer> c : count.entrySet()) {
            if (!c.getKey().equals(" ")) {
                System.out.println(c.getKey() + " -> " + c.getValue());
            }
        }

    }
}
