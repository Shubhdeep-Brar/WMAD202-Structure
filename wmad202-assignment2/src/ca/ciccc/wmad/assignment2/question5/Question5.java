package ca.ciccc.wmad.assignment2.question5;

import java.util.Scanner;


public class Question5 {

    public static void ReverseString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");


        String Word = input.nextLine();
        String Result = "";
        for(int i = Word.length()-1; i>=0; i--)
        {
            Result = Result.concat(String.valueOf(Word.charAt(i)));
    }
        System.out.printf("Reversed value is %s\n", Result);

        if(Word.equals(Result)){
            System.out.print("Word and Reversed word are same");
        }
        else{
            System.out.print("Word and Reversed word are not same");
        }

}}
