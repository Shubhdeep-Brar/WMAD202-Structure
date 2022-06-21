package ca.ciccc.wmad.assignment3.question6;

// Write a method which receives a list of integers which may contains repeated numbers.
// The method removes the repeated numbers and keeps the distinct numbers. The function
// should return the list of distinct numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {

    public static void distinctNumbers(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();


        System.out.print("Enter a number: ");
        while(input.hasNextInt()) {
            int number = input.nextInt();
            System.out.print("Enter next number: ");
            if (numbers.contains(number));

            else {
                numbers.add(number);
            }
        }
            System.out.printf("Distinct numbers are: %s\n", Arrays.toString(new ArrayList[]{numbers}));

        // there is no percentage format for list so we have
        //to use it as %s and use it string.



    }

}
