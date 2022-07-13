package ca.ciccc.wmad.assignment5.Question2part3;

public class TestBank {

    public void run(){

        Transaction transaction1 = new Transaction(1, Transaction.DEPOSIT, 3000);
        Transaction transaction2 = new Transaction(2, Transaction.WITHDRAW, 2000);
        Transaction transaction3 = new Transaction(3, Transaction.DEPOSIT, 500);
        Transaction transaction4 = new Transaction(4, Transaction.WITHDRAW, 100);
        Transaction transaction5 = new Transaction(5, Transaction.DEPOSIT, 10000);
        Transaction transaction6 = new Transaction(6, Transaction.WITHDRAW,3200);

        BankStatement bank = new BankStatement();
        bank.addTransaction(transaction1);
        bank.addTransaction(transaction2);
        bank.addTransaction(transaction3);
        bank.addTransaction(transaction4);
        bank.addTransaction(transaction5);
        bank.addTransaction(transaction6);

        bank.printAllTransactions();
        System.out.println();

}

}
