package ca.ciccc.wmad.assignment2.question6;

import java.util.Scanner;

public class Question6 {

    public static void printIsValidArithmeticStatement() {

        int numberOfOpenParentheses = 0;
        int numberOfClosedParentheses = 0;

        boolean isTheStatementValid = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Arithmetic Statement: ");
        String statement = input.nextLine();

        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == '(') {
                numberOfOpenParentheses = numberOfOpenParentheses + 1;
            } else if (statement.charAt(i) == ')') {
                numberOfClosedParentheses = numberOfClosedParentheses + 1;
            }
            if (numberOfOpenParentheses > numberOfClosedParentheses) {
                isTheStatementValid = false;
                break;
            }
        }
        if (numberOfOpenParentheses != numberOfClosedParentheses) {
            isTheStatementValid = false;
        }

         if(isTheStatementValid){
             System.out.println("The statement is valid");
         } else {
             System.out.println("The statement is NOT valid");
    }
}}
