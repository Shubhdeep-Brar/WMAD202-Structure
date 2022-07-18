package ca.ciccc.wmad.assignment7.question1;

import java.util.ArrayList;

public class TestCounter {

    public void run(){

        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(001,"Shubh", 4.00F);
        Student student2 = new Student(002,"Deep",3.66F);
        Student student3 = new Student(003,"Brar", 2.77F);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        ArrayList<Account> accounts = new ArrayList<>();

        Account account1 = new Account(123,"RBC", 10000);
        Account account2 = new Account(456,"SCOTIA",4000);
        Account account3 = new Account(789,"TD", 3000);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("Sidhu", "Sci-Fi",200);
        Book book2 = new Book("Harpreet", "Drama", 150);
        Book book3 = new Book("Mohit", "Fiction", 130);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Counter<Student> studentCounter = new Counter<>(students);
        studentCounter.countNumberOfElementsWithSpecificProperty();
        System.out.printf("%d Students have more than 3.5 gpa\n",studentCounter.countNumberOfElementsWithSpecificProperty());

        Counter<Book> bookCounter = new Counter<>(books);
        bookCounter.countNumberOfElementsWithSpecificProperty();
        System.out.printf("%d books are of Fiction Category\n",bookCounter.countNumberOfElementsWithSpecificProperty());

        Counter<Account> accountCounter = new Counter<>(accounts);
        accountCounter.countNumberOfElementsWithSpecificProperty();
        System.out.printf("%d accounts have more than 5000 amount\n",accountCounter.countNumberOfElementsWithSpecificProperty());

    }

}
