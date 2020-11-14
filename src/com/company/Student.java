package com.company;

public class Student {
    static int index = 0;
    private String mName;
    private String mSchool;
    public Student(String name, String school) {
        int id = ++index;
        System.out.println("Name : " + name);
        System.out.println("School : " + school);
        System.out.println("Id studenta to : " + id);
    }
}
