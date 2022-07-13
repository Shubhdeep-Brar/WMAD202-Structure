package ca.ciccc.wmad.assignment6.Question1;

import java.util.ArrayList;

public class Cloth extends Product{

    private ArrayList<Material> clothMaterial;

    public Cloth(int productID, String productName, float productPrice, String productMadeInCountry, ArrayList<Material> clothMaterial){
        super(productID, productName, productPrice, productMadeInCountry );

        this.clothMaterial = clothMaterial;

    }

    @Override
    public String toString(){
        return "ID: " +this.productID + "\n" + "Name: " +this.productName +"\n"+ "Price: " +this.productPrice +"\n" + "Made in: " + this.productMadeInCountry +"\n" + "Material: " + this.clothMaterial +"\n";
    }
}
