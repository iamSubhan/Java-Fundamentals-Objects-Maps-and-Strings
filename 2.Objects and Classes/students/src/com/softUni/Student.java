package com.softUni;

public class Student {
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    //constructor
    public Student(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    //getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public String getHomeTown() {
        return this.homeTown;
    }
}

