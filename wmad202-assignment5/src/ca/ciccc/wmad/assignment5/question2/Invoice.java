package ca.ciccc.wmad.assignment5.question2;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> products;

    public Invoice() {
        this.products = new ArrayList<>();
    }

    public Invoice(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }

    public void clearProducts(Product product) {
        this.products = new ArrayList<>();

    }

    public void printAllProducts(){
        for(Product p : this.products){
            System.out.printf("Name: %s, Price: %f\n", p.getName(), p.getPrice());
        }
    }
    public void printTotalPrice() {
        System.out.printf("Total: $%f\n", this.getTotalPrice());
    }


    private double getTotalPrice() {
        double total = 0;

        for (Product product : this.products) {
            total += product.getPrice();
        }

        return total;
    }

    }
