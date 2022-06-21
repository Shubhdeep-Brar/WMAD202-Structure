package ca.ciccc.wmad.assignment3.question1;

import java.net.SocketOption;
import java.util.Scanner;

public class Question1 {

    public static boolean isPrime(int number){

        int i;
        for(i = 2; i < number;i++){
            if(number % i == 0){
            return false;}
    }
        return true;}

    public static void printPrimeOrNot(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num = input.nextInt();

        if(isPrime(num)){
            System.out.print(" This number is a prime number: ");
        }
        else{
            System.out.print(" This number is not a prime number");
        }
    }
}
