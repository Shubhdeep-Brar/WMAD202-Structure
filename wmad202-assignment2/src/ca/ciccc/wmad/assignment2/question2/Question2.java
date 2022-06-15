package ca.ciccc.wmad.assignment2.question2;

import java.util.Scanner;

public class Question2 {

    public static void reverseNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while (number % 10 == 0) {
            System.out.println("Invalid Input Number should not be divisible by 10, Enter another number: ");
            number = input.nextInt();
        }
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);

    }

}

