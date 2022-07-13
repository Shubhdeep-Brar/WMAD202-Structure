package ca.ciccc.wmad.assignment5.Question2part3;

import java.util.ArrayList;

public class BankStatement {
    private ArrayList<Transaction> transactions;
    private double totalBalance;

    public BankStatement(ArrayList<Transaction> transactions, double totalBalance) {
        this.transactions = transactions;
        this.totalBalance = totalBalance;
    }

    public BankStatement() {
        this.transactions = new ArrayList<>();
        this.totalBalance = 0;
    }

    public void addTransaction(Transaction transaction) {
        if (transaction.getType().equals(Transaction.WITHDRAW) && this.totalBalance < transaction.getAmount()) {
            System.out.println("Withdrawal amount is bigger than available balance");
            System.out.printf("ID: %d, Amount: %f\n", transaction.getId(), transaction.getAmount());
        }
        this.transactions.add(transaction);
        double total = 0;
        for(Transaction record : this.transactions){
            if(record.getType().equals(Transaction.DEPOSIT)) {
                total = total + record.getAmount();
            } else if (record.getType().equals(Transaction.WITHDRAW)) {
                total = total - record.getAmount();
            }
        }
        this.totalBalance = total;
    }
    public void printAllTransactions(){
        System.out.println("---Transactions---");
        for(Transaction transaction : this.transactions){
            System.out.printf("--ID: %d\n", transaction.getId());
            System.out.printf("--Type: %s\n", transaction.getType());
            System.out.printf("--Amount: %f\n", transaction.getAmount());
        }
        System.out.printf("Total Sum: %f\n", this.totalBalance);
    }

}
