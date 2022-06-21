package ca.ciccc.wmad.assignment3.question2;

import ca.ciccc.wmad.assignment3.question1.Question1;

import java.util.Scanner;

import static ca.ciccc.wmad.assignment3.question1.Question1.isPrime;

public class Question2 {

    public static void printNextPrimeNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num = input.nextInt();
        int nextNumber = num + 1;

        while(!isPrime(nextNumber)) {
            nextNumber = nextNumber + 1;
        }
        System.out.printf("The next Prime number is: %d", nextNumber);

        }

    }

