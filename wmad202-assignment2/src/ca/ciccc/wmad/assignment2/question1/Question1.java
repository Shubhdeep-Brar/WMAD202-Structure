package ca.ciccc.wmad.assignment2.question1;

import java.util.Scanner;

public class Question1 {

    public static void printNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

         printDivisibleNumbersBy3And5(num1, num2);
         printDivisibleNumberBy6Or7(num1, num2);
         printNotDivisibleBy3(num1, num2);

    }

    private static void printDivisibleNumbersBy3And5(int num1, int num2) {

        int i;
        for (i = num1 +1 ; i < num2; i++){
            if ((i % 3== 0) && (i % 5 ==0)){
                System.out.printf("Following number is divisible by 3 and 5 (num1 and num2 not included): %d\n", i);
            }
        }}

    private static void printDivisibleNumberBy6Or7(int num1, int num2) {
        int i;
        for (i = num1; i < num2; i++) {
            if ((i % 6 == 0) || (i % 7 == 0)) {
                System.out.printf("Following number is divisible by 6 or 7 (num1 included but num2 not included): %d\n", i);
            }
        }
    }

    private static void printNotDivisibleBy3(int num1, int num2) {
        int i;
        for (i = num1; i <= num2; i++);{
            if(i % 3 !=0) {
                System.out.printf("Following number is not divisible by 3 (num1 and num2 both are included): %d\n", i);

            }

        }
    }
    }