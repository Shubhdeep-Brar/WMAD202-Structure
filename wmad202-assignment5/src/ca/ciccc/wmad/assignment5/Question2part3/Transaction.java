package ca.ciccc.wmad.assignment5.Question2part3;

public class Transaction {
    private int id;
    private String type;
    private double amount;

    public static String DEPOSIT = "deposit";
    public static String WITHDRAW = "withdraw";

    public Transaction(int id,String type, double amount){
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }
}
