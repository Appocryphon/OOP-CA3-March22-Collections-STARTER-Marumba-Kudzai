package com.dkit.gd2.johnloane;



import java.util.*;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    Student Students;
    Employee Employee;
    public static void main( String[] args ) {
        App app = new App();
        app.start();



        }

    private void start() {

        List<Student> students = new ArrayList<>();
        Set<String> uniqueEmployeeName = new HashSet<>();

        //Question 1
        students.add(new Student(1, "John Tayag", 21));
        students.add(new Student(2, "Sergej Zapivalovs", 22));
        students.add(new Student(3, "Bobert Pekala", 21));
        students.add(new Student(4, "Kudzai Marumba", 24));
//        questionOnePartB();
//        questionOnePartC();
//        questionOnePartD();

        //Question 2
//        questionTwoPartA();
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amos", "Quitto"));
        employees.add(new Employee("Ben", "Dover"));
        employees.add(new Employee("Dick", "Byrne"));
        employees.add(new Employee("Muff", "Byrne"));
        employees.add(new Employee("Optimus", "Battie-Boy"));


//        questionTwoPartB();



//
//        questionTwoPartC();



        NameAndCount();
//        questionTwoPartD();

        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
//        questionThreePartA(oneHundredStrings);
//        questionThreePartB();

        //Question 4
        compareTwoStudents();
//        questionFourPartA();
//        questionFourPartB();
//        questionFourPartC();
    }



    //    public boolean printUniqueNames(String firstName)
//    {
//
//
//        return uniqueEmployeeName.add(firstName);
//
//    }
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






        //The method below relates to Question 4
        private static void compareTwoStudents ()
        {
            Student alex1 = new Student(1, "Alex", 22);
            Student alex2 = new Student(1, "Alex", 22);
            System.out.println("alex1 hashcode = " + alex1.hashCode());
            System.out.println("alex2 hashcode = " + alex2.hashCode());
            System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        }

        //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
        private static void populateOneHundredStrings (List < String > oneHundredStrings)
        {
            for (int i = 0; i < 100; i++) {
                if (i / 10 == 0) {
                    oneHundredStrings.add("Java");
                } else if (i / 10 == 1) {
                    oneHundredStrings.add("Python");
                } else if (i / 10 == 2) {
                    oneHundredStrings.add("C++");
                } else if (i / 10 == 3) {
                    oneHundredStrings.add("Javascript");
                } else if (i / 10 == 4) {
                    oneHundredStrings.add("Ruby");
                } else if (i / 10 == 5) {
                    oneHundredStrings.add("Golang");
                } else if (i / 10 == 6) {
                    oneHundredStrings.add("C#");
                } else if (i / 10 == 7) {
                    oneHundredStrings.add("C");
                } else if (i / 10 == 8) {
                    oneHundredStrings.add("R");
                } else if (i / 10 == 9) {
                    oneHundredStrings.add("Swift");
                }
            }
        }

}
