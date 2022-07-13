package ca.ciccc.wmad.assignment4.question3;

//Design and implement a method which has one input parameter which is a number which
//is greater than 50, called num. Then the method will create a dictionary whose keys are 2
//and 3 and 4 and 5 and 6 and 7 and 8 and 9. Then the method calculates the values for
//each of the above keys. The value for a key is all the numbers between 2 and input “num”
//that are divisible by the key. The method eventually will print the result.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {

    public static void divisibleBy() {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> numbers = new HashMap<>();
        System.out.print("Enter a number greater than 50: ");
        int num = input.nextInt();

        for (int i = 2; i <= 9; i++) {
            numbers.put(i, new ArrayList<>());
        }

        for(int i = 2; i <=9; i++){
            for(int j = 2; j <= num; j++){
              if(j%i==0){
                  numbers.get(i).add(j);
              }
            }
        }
        for(Integer key : numbers.keySet()){
            System.out.printf("%d : %s\n",key, numbers.get(key));
        }

    }


}
