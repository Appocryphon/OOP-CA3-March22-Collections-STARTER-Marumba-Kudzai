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

        public boolean printUniqueNames(uniqueNames)
    {


        return uniqueEmployeeName.add(firstName);

    }

    private void printNameAndCount (NameAndCount)
    {
        String title = Employee.getFirstName();

        String array[] = title.split(" ");

        for (String s : array)

            System.out.println(s + ", ");

        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String word : array) {
            Integer count = nameCountMap.get(word);
            if (count != null) {
                nameCountMap.put(word, count + 1);
            } else {
                nameCountMap.put(word, 1);
            }
        }

        System.out.println("Count of 'of' : = " + nameCountMap.get("of"));
    }


    public  void getNextOnWaitingList(waitingList)
    {


        String array[] = title.split(" ");

        for (String s: array)

            System.out.println(s + ", ");

        Map<String, ArrayList<Integer>> wordPositionMap = new HashMap<>();
        int wordPosition = 0;

        for (String word : array)
        {
            wordPosition++;
            ArrayList positions = wordPositionMap.get(word);
            if (positions != null)
            {
                positions.add(wordPosition);

            }

            else
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(wordPosition);
                wordPositionMap.put(word,list);
            }
        }

        System.out.println("Position of 'of' : = "+ wordPositionMap.get("of"));
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
