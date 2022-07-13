package ca.ciccc.wmad.assignment5.question2;

public class TestInvoice {
    public void test(){
        Invoice invoice = new Invoice();

        Product apple1 = new Product("apple", 1.3);
        Product apple2 = new Product("apple", 1.3);
        Product guava = new Product("guava", 2);
        Product meat = new Product("meat", 3.2);
        Product chicken = new Product("chicken", 3);

        invoice.addProducts(apple1);
        invoice.addProducts(apple2);
        invoice.addProducts(guava);
        invoice.addProducts(meat);
        invoice.addProducts(chicken);

        invoice.printAllProducts();
        invoice.printTotalPrice();

}}
