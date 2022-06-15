package ca.ciccc.wmad.assignment2.question9;

import java.util.Scanner;

public class Question9 {

    public void printUpperName(){
        boolean terminates = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        for(int i = 0; i < name.length(); i++){
            if((name.charAt(i) == '0') || (name.charAt(i) == '1') || (name.charAt(i) == '2') || (name.charAt(i) == '3') || (name.charAt(i) == '4') ||
                    (name.charAt(i) == '5') || (name.charAt(i) == '6') || (name.charAt(i) == '7') || (name.charAt(i) == '8') || (name.charAt(i) == '9'))
            {terminates = true;
        }
    }
        if(!terminates) {
            System.out.println(name.toUpperCase());
        }
        while(!terminates);
        System.out.println("Terminating...");

}}
