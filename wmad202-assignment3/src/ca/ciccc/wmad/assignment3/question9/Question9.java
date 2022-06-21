package ca.ciccc.wmad.assignment3.question9;

import java.util.ArrayList;
import java.util.Scanner;

import static ca.ciccc.wmad.assignment3.question1.Question1.isPrime;

public class Question9 {

    public static void primeVisibility(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number;

        System.out.print("Enter a number: ");
        while(input.hasNextInt()){
            System.out.print("Enter a number ");
            number = input.nextInt();
            list.add(number);
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = in.nextInt();

        int primeVisibility = 0;

        for(int i = index; 0 <= i; i--){
            if(isPrime(list.get(i))){
                primeVisibility++;
        }

    }
        System.out.printf("The prime visibility of given index %d is %d\n",index, primeVisibility);
}}
