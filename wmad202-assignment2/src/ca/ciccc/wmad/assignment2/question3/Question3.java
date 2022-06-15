package ca.ciccc.wmad.assignment2.question3;

import java.util.Scanner;

public class Question3 {

    public static void Binarynumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int number = input.nextInt();

        String result = " ";
        int quotient = number / 2;
        int remainder = number % 2;
        result = String.valueOf(remainder).concat(result);

        while(quotient != 0) {
            remainder = quotient % 2;
            quotient = quotient / 2;

            result = String.valueOf(remainder).concat(result);

        }
            System.out.printf("%s\n", result);


    }
}
