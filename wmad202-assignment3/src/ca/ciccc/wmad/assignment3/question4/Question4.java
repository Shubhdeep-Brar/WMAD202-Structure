
package ca.ciccc.wmad.assignment3.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {

    public static void printMostRepeatedNumbers(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int [] frequencies = new int[100];

        System.out.print("Enter a number)");
        while(input.hasNextInt()){
            int nextNumber = input.nextInt();
            numbers.add(nextNumber);
            System.out.print("Enter a  number");
        }
        for(Integer number : numbers){
            frequencies[number]++;
        }
        int mostRepeatedNumber = 0;
        int mostRepeated = 0;

        for(int i = 1; i < frequencies.length; i++){
            if(mostRepeated < frequencies[i]){
                mostRepeatedNumber = i;
                mostRepeated = frequencies[i];
            }
        }
        System.out.printf("Most repeated number:  %d\n", mostRepeatedNumber);

    }


}
