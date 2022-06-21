package ca.ciccc.wmad.assignment3.question7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    public static void printIndex(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        //int numberToAdd = input.nextInt();

        System.out.print("Enter a number to add to list: ");
        while(input.hasNextInt()){
            int numberToAdd = input.nextInt();
            numbers.add(numberToAdd);
            System.out.print("Enter a number to add to list: ");

        }
        System.out.print("Enter a number to search in list: ");
        Scanner search = new Scanner(System.in);
        int numberToSearch = search.nextInt();

        for(int i = 0; i < numbers.size(); i++) {

            if (numberToSearch == numbers.get(i)) {
                System.out.printf("This number is present in list at index %d\n", i);
                return;
            }

        }
        System.out.print("The number is not present in the list");
}}
