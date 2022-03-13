package com.softUni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            //Instance (create student object)
            Student student = new Student(firstName, lastName, age, homeTown);
            //To save each student in a list
            students.add(student);
            input = scanner.nextLine();
        }

        String hometown = scanner.nextLine();
        for (Student student : students) {
            if(hometown.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old.%n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }

    }
}
