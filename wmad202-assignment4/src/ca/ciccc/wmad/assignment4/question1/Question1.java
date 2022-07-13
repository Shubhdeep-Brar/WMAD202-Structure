package ca.ciccc.wmad.assignment4.question1;

//Write a method which has no input parameter. The method asks the user to enter
// numbers. The user can enter repeated numbers but if the user entered a number which
// was already entered, the method will provide an error message to the user and ask the
// user to enter another one. The user can enter numbers as long as s/he has not entered 0.
// Once a 0 is entered, the method returns the sum of all distinct numbers the user had
// entered.

import java.util.HashSet;
import java.util.Scanner;

public class Question1 {

    public static void printDistinctNumbers(){
        Scanner input = new Scanner(System.in);
        HashSet<Integer> Set = new HashSet<>();
        System.out.print("Enter a number: ");

        int number = input.nextInt();
        int totalSum = number;

        while(number != 0){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(Set.contains(number)){
                System.out.print("Error ! Enter another number");
            }
            else {
                Set.add(number);
                totalSum = totalSum + number;
            }
        }
        System.out.printf("Total Sum of Distinct numbers is %d", totalSum);
    }

}

