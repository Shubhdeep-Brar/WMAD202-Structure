package ca.ciccc.wmad.assignment3.question5;
//Write a method, which receives a list of positive integers between 1 and 99, which may
//  or may not contains repeated numbers.
//  The methods should print out how many each item in the list is repeated.

import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {

    public static void printFrequency(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] frequencies = new int[100];

        System.out.print("Enter a number: ");
        while(input.hasNextInt()){
            int nextNumber = input.nextInt();
            numbers.add(nextNumber);
            System.out.print("Enter a number");
        }
        for(Integer number : numbers){
            frequencies[number]++;
        }

        for(int i = 1; i < frequencies.length; i++){
            System.out.printf("%d is repeated %d times\n", i , frequencies[i]);
        }

        }


}
