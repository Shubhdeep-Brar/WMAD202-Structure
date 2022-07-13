package ca.ciccc.wmad.assignment3.question3;

import java.util.Scanner;

public class Question3 { //instance method cannot call class method inside itself.
                        //class method cannot call instance method inside itself. if class requires properties you have
                        //to use instance method. if it does not require properties you don't have to use instance method.

    public static void printPattern() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.print("Enter a pattern [like SHAPE1, SHAPE2, SHAPE3]: ");
        String pattern = in.next();

        switch (pattern) {                              //readable format of if else statement.
            case "SHAPE1" -> printShape1Pattern(number);
            case "SHAPE2" -> printShape2Pattern(number);
            case "SHAPE3" -> printShape3Pattern(number);
        }
    }
        private static void printShape1Pattern(int number) {
            int blanks = 0;

            for (int i = number; 0 <= i; i-=2) {
                for (int j = 0; j < blanks; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i ; k++) {
                    System.out.print("*");
                }
                System.out.println();
                blanks++;
            }
        }
        private static void printShape2Pattern(int number) {
            for (int i = number; 0 <= i ; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        private static void printShape3Pattern(int number) {
            for (int i = 1; i < number + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }





