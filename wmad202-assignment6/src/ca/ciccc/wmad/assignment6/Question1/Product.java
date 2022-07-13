package ca.ciccc.wmad.assignment6.Question1;

public class Product {

    protected int productID;
    protected String productName;
    protected float productPrice;
    protected String productMadeInCountry;

    public Product(int productID, String productName, float productPrice, String productMadeInCountry) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    @Override
    public String toString() {
        return "ID: " + this.productID + "Name: " +this.productName + "Price: " +this.productPrice + "Made in Country: " +this.productMadeInCountry;

    }
    public float getProductPrice(){
        return productPrice;
    }
    public String getProductName(){
        return productName;
    }
    public int getProductID(){
        return productID;
    }

    public String getProductMadeInCountry() {
        return productMadeInCountry;

    }

}

