package ca.ciccc.wmad.assignment1.question5;

import java.util.Scanner;

public class Question5 {
    public static final double PI= 3.14;


    public static void circleArea(){
        System.out.format("please enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();

        System.out.format("The radius is %f and the area is %f",radius,radius*radius*PI);
        }
}
