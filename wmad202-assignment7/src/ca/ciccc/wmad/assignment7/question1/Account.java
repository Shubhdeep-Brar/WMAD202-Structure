package ca.ciccc.wmad.assignment7.question1;

public class Account implements Specifier {

    private int number;

    private String name;

    private int amount;

    public Account(int number, String name, int amount){
        this.number = number;
        this.name = name;
        this.amount = amount;

    }

    @Override
    public boolean hasSpecificValue() {
        return this.amount > 5000;
    }
}
