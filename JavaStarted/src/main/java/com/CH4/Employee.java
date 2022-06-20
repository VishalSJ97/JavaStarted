package com.CH4;

class DOB {
    int date;
    int month;
    int year;

    public DOB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "DOB{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

public class Employee {
    int id;
    String name;
    DOB d;

    public Employee(int id, String name, DOB d) {
        this.id = id;
        this.name = name;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Employee :: [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", d=" + d +
                ']';
    }
}
