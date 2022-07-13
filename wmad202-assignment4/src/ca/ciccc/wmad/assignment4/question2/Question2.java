package ca.ciccc.wmad.assignment4.question2;

import java.util.*;

public class Question2 {

    public static void Dictionary(){
        Scanner input = new Scanner(System.in);
        HashMap<Character, ArrayList<String>> words = new HashMap<>();

        for(char i = 'A'; i <= 'Z'; i++){   // Using ASCII CODE or else the other way is to manually create it
            words.put(i, new ArrayList<>());
        }

        System.out.print("Enter a word: ");

        String nextWord = input.nextLine();

        while(!nextWord.equals("exit")){
            char firstLetter = nextWord.toUpperCase().charAt(0);
            if(!words.get(firstLetter).contains(nextWord)){
                words.get(firstLetter).add(nextWord);
                Collections.sort(words.get(firstLetter));
            }
            System.out.print("Enter a word: ");
            nextWord = input.nextLine();
        }
        System.out.print(words);

    }

}
