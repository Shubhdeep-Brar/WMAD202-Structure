package ca.ciccc.wmad.assignment7.question1;

public class Book implements Specifier {

    private String author;

    private String category;

    private int pages;

    public Book(String author, String category, int pages){
        this.author = author;
        this.category = category;
        this.pages = pages;


    }

    @Override
    public boolean hasSpecificValue() {
        return this.category == "Fiction";
    }
}
