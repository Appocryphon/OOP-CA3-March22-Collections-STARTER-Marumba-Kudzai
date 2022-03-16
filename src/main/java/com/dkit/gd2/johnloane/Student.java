package com.dkit.gd2.johnloane;

import java.util.ArrayList;
import java.util.List;

public class Student
{
        List<Student> students;

    private int id;
    private String name;
    private int age;


    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.students = new ArrayList<>();


    }




    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }


}
