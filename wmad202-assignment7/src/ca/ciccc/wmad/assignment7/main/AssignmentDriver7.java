package ca.ciccc.wmad.assignment7.main;

import ca.ciccc.wmad.assignment7.Question3.ElementExchanger;
import ca.ciccc.wmad.assignment7.Question4.Functions;
import ca.ciccc.wmad.assignment7.Question5.RelativePrimeCheck;
import ca.ciccc.wmad.assignment7.question1.Student;
import ca.ciccc.wmad.assignment7.question1.TestCounter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class AssignmentDriver7 {

    public static void run(){
//problem 1
  //TestCounter sample = new TestCounter();
 // sample.run();

        //problem3

//        ArrayList<String> exchange1 = new ArrayList<>();
//        exchange1.add("Apple");
//        exchange1.add("Banana");
//        exchange1.add("Cabbage");
//        exchange1.add("lemon");
//        exchange1.add("Orange");
//
//        ElementExchanger sample = new ElementExchanger<>(exchange1);
//        sample.exchangeElements(2,4);
//        System.out.println(sample.getList());

        //Problem 4

//        Functions<Student> list1 = new Functions<>();
//
//        Student student1 = new Student(001,"Shubh",  3.95F);
//        Student student2 = new Student(002,"Deep",4.23F);
//        Student student3 = new Student(003,"Singh",2.95F);
//        Student student4 = new Student(004,"Brar",2.25F);
//        Student student5 = new Student(005,"Punjab",3.86F);
//
//        list1.addItemToList(student1);
//        list1.addItemToList(student2);
//        list1.addItemToList(student3);
//        list1.addItemToList(student4);
//        list1.addItemToList(student5);
//
//        list1.removeItemFromList(student3);
//
//        System.out.println(list1);
//
//        System.out.println(list1.performSearchOperation(student4));

        // problem 5

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(13);
        RelativePrimeCheck.UnaryPredicate<Integer> p = num -> num == 1;
        System.out.println(RelativePrimeCheck.findFirst(numbers,0,1,p));




}
}
