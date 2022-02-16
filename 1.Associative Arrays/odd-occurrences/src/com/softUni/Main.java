package com.softUni;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String lowerCaseKey = word.toLowerCase();
            counts.putIfAbsent(lowerCaseKey, 0);
            counts.put(lowerCaseKey, counts.get(lowerCaseKey) + 1);
        }

        List<String> odd = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odd.add(entry.getKey());
            }
        }
        for (int i = 0; i < odd.size()-1; i++) {
            System.out.print(odd.get(i) + ", ");
        }
        if (odd.size() > 0) {
            System.out.println(odd.get(odd.size()-1));
        }
        //Reason for above style is to remove the trailing comma, so need to separate the last element
    }
}
