package ca.ciccc.wmad.assignment6.Question1;

public class Drink extends Product {

    private boolean isDrinkDiet;
    private int size;


    public Drink(int productID, String productName, float productPrice, String productMadeInCountry, boolean isDrinkDiet, int size) {
        super(productID, productName, productPrice, productMadeInCountry);

        this.isDrinkDiet = isDrinkDiet;
        this.size = size;

    }
    @Override
    public String toString() {
        return "ID: " + this.productID + "\n" + "Name: " + this.productName + "\n" + "Price: " + this.productPrice + "\n" + "Made in: " + this.productMadeInCountry+ "\n" + "Diet: " + this.isDrinkDiet + "\n" + "Size: " + this.size+ "\n";
    }
}
