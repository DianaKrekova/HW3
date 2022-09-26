package ru.mirea.krekova2;

public class Employer {
    public String firstName;
    public String lastName;
    public double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome(){
        return income;
    }
}