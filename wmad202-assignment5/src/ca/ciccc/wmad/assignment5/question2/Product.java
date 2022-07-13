package ca.ciccc.wmad.assignment5.question2;

public class Product {

    private String name;

    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
}
