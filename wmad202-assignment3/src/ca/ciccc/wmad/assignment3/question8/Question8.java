package ca.ciccc.wmad.assignment3.question8;

//Design and implement a method which has one input parameter, called topLimit, which is
// a number between 40 and 100. Also, the method has a second input parameter which is
// also a positive integer, called number.
//-The method should create and returns list which contains all numbers in range 2 (two) to
// topLimit that are divisible to number

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {

    public static void printDivisibleNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 40 and 100 for top limit: ");
        int topLimit = input.nextInt();

        if (40 > topLimit || 100 < topLimit) {
            System.out.print("Invalid number, the number should be between 40 and 100");
            return;
        }
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= topLimit; i++) {
            if (i % number == 0) {
                list.add(i);
            }
        }
        System.out.printf("Following numbers are divisible by number %d: %s\n", number, list.toString());
    }
}