package ca.ciccc.wmad.assignment6.main;

import ca.ciccc.wmad.assignment6.Question1.*;
import ca.ciccc.wmad.assignment6.Question2.ShoppingCart;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AssignmentDriver6 {
    public static void run() {

//        Product product1 = new Product(110, "Diet Pepsi", 2, "USA");
//
//
//
//        Drink drink1 = new Drink(01, "Coke", 2, "US", true, 100);
//
//        ArrayList<String> ingredients = new ArrayList<>();
//        ingredients.add("apple");
//        ingredients.add("banana");
//        ingredients.add("milk");
//        ingredients.add("sugar");
//
//        Food food1 = new Food(02,"smoothie",1,"Canada",100,50, ingredients);
//        ArrayList<Material> M = new ArrayList<>();
//
//
//        Material material1  = new Material(03,"cotton");
//        M.add(material1);
//
//        Cloth cloth1 = new Cloth(01,"Raymond", 20,"India", M);
//
//        System.out.print("----Drink1---- \n");
//        System.out.print(drink1.toString());
//
//        System.out.print("----Food 1 ----\n");
//        System.out.print(food1.toString());
//
//        System.out.print("----Material 1---\n");
//        System.out.print(material1.toString());
//
//        System.out.print("---Cloth---\n");
//        System.out.print(cloth1.toString());

        Drink drink1 = new Drink(412,"Pepsi",2, "USA", false,150);
        Drink drink2 = new Drink(412,"Pepsi",2, "USA", false,150);
        Drink drink3 = new Drink(412,"Pepsi",2, "USA", false,150);

        Drink drink4 = new Drink(183,"Ginger Zero",3, "Canada", true,200);

        ArrayList<String> ingredients1 = new ArrayList<>();
        ingredients1.add("Chicken");
        ingredients1.add("Oil");
        ingredients1.add("Cheese");

        Food food1 = new Food(100, "Chicken", 8, "Canada",350,4, ingredients1);
        Food food2 = new Food(100, "Chicken", 8, "Canada",350,4, ingredients1);

        ArrayList<String> ingredients2 = new ArrayList<>();
        ingredients2.add("pasta");
        ingredients2.add("meat");
        ingredients2.add("spinach");

        Food food3 = new Food(101,"Pasta", 18, "Canada",250,3, ingredients2);
        Food food4 = new Food(101,"Pasta", 18, "Canada",250,3, ingredients2);

        Material tShirt1 = new Material(10, "Cotton");
        Material tShirt2 = new Material(11, "Nylon");

        ArrayList<Material> M2 = new ArrayList<>();
        M2.add(tShirt1);
        M2.add(tShirt2);

        Cloth cloth2 = new Cloth(701,"T-shirt", 15, "China", M2);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(drink1);
        shoppingCart.addItem(drink2);
        shoppingCart.addItem(drink3);
        shoppingCart.addItem(drink4);

        shoppingCart.addItem(food1);
        shoppingCart.addItem(food2);
        shoppingCart.addItem(food3);
        shoppingCart.addItem(food4);

        shoppingCart.addItem(cloth2);

        System.out.printf("Total amount: %f\n", shoppingCart.totalAmount());
        shoppingCart.printReceipt();

        shoppingCart.printReceiptInDetail();

}
}

