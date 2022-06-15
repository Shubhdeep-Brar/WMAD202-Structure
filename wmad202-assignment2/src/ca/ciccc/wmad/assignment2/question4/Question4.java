package ca.ciccc.wmad.assignment2.question4;

import java.util.Scanner;

public class Question4 {

    public static void MaxandMin() {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int Max = number;
        int Min = number;

        System.out.println("Enter a number: ");

        while (input.hasNextInt()) {
            number = input.nextInt();
            if (Max < number) Max = number;
            else if (number < Min) Min = number;

            System.out.println(" Enter a number: ");
            }

        int distance = Math.abs(Max - Min);

        System.out.printf("Maximum: %d, Minimum: %d, Distance: %d\n", Max, Min, distance);

    }}
