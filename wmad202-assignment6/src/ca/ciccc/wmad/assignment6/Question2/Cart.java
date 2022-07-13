package ca.ciccc.wmad.assignment6.Question2;

import ca.ciccc.wmad.assignment6.Question1.Product;

public interface Cart {

    void addItem(Product product);

    void removeItem(Product product);

    float totalAmount();

    void printReceipt();

    void printReceiptInDetail();

}
