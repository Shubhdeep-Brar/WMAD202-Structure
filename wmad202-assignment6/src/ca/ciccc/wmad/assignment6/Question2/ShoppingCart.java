package ca.ciccc.wmad.assignment6.Question2;

import ca.ciccc.wmad.assignment6.Question1.Product;

import java.util.ArrayList;

public class ShoppingCart implements Cart {
    private ArrayList<Product> products;

    public ShoppingCart(ArrayList<Product> products){
        this.products = products;
    }
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addItem(Product product) {
        this.products.add(product);
    }

    @Override
    public void removeItem(Product product) {
        this.products.remove(product);
    }

    @Override
    public float totalAmount() {
        float total = 0;

        for(Product items : this.products){
            total = total + items.getProductPrice();
        }
        return total;
    }

    @Override
    public void printReceipt() {

        for(Product name : this.products){
            System.out.printf("Product Name: %s\n", name.getProductName());
        }
    }
    @Override
    public void printReceiptInDetail() {
        for(Product product : this.products){
            System.out.println(product.toString());
        }

    }
}
