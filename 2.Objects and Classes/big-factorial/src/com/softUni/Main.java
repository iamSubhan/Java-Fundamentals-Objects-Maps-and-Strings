package com.softUni;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger result = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }

        System.out.println(result);
    }
}
