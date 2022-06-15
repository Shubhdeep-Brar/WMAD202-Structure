package ca.ciccc.wmad.assignment2.question7;

import java.io.PrintStream;
import java.util.Scanner;

public class Question7 {

    final static double PI = 3.14;
    public static void AreaOfCircle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        double side = input.nextInt();

        double radius = Math.sqrt(2*Math.pow(side/2,2));

        double area = Math.pow(radius,2)*PI;
         System.out.printf("Area of circle which has square inscribed in it with side "+side+" is "+area);

    }
    }
