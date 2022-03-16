package com.dkit.gd2.johnloane;

//This class is needed to answer question 2



import java.util.*;

public class Employee
{

    Set<String> uniqueEmployeeName = new HashSet<>();
    List<Employee> employees;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

//    public void pickLuckyWinner(employees)
//    {
//
//    }





    @Override
    public String toString()
    {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
