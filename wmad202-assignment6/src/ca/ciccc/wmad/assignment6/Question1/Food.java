package ca.ciccc.wmad.assignment6.Question1;

import java.util.ArrayList;

public class Food extends Product {

    private int foodCalorie;
    private int foodSize;
    private ArrayList<String> foodIngredients;

    public Food(int productID, String productName, float productPrice, String productMadeInCountry, int foodCalorie, int foodSize, ArrayList<String> foodIngredients) {
        super(productID, productName, productPrice, productMadeInCountry);

        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;

    }
    @Override
    public String toString() {
        return "ID: " + this.productID + "\n" + "Name: " + this.productName + "\n" + "Price: " + this.productPrice + "\n" + "Made in: " + this.productMadeInCountry + "\n" + "Calorie: " + this.foodCalorie + "\n" + "Size: " + this.foodSize + "\n" + "Ingredients: " + this.foodIngredients + "\n";
    }
}