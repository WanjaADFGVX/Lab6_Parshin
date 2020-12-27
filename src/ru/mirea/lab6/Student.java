package ru.mirea.lab6;

public class Student {
    private String firstName;
    private String lastName;
    private int iDNumber;

    public Student(String firstName, String lastName, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int iD() {
        return iDNumber;
    }
}
