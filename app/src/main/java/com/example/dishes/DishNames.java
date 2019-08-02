package com.example.dishes;

import java.util.ArrayList;
import java.util.List;

public class DishNames {

    List<String> names (String types) {
        List<String> food = new ArrayList<String>();
        if(types.equals("Veg"))
        {
            food.add("Paneer Tikka");
            food.add("Chilli Paneer");
            food.add("Shahi Paneer");
            food.add("Veg-Burger");
            food.add("Veg-Roll");
        }
        else if(types.equals("Non-veg"))
        {
            food.add("Chicken Fry");
            food.add("Chilli Chicken");
            food.add("Shawarma");
            food.add("Chicken Afghani");
            food.add("Chicken Burger");
            food.add("Chicken Roll");
        }
        else if(types.equals("Chinese"))
        {
            food.add("Fried Rice");
            food.add("Singapori Noodles");
            food.add("Chilli Garlic Noodles");
            food.add("Chicken Chowmein");
            food.add("Hakka Noodles");
        }
        else if(types.equals("Add-ons"))
        {
            food.add("Chilli Sauce");
            food.add("Hot & Sweet Sauce");
            food.add("Mayoniase");
            food.add("Oregano");
            food.add("Chilli Flakes");
        }
        else if(types.equals("Dessert"))
        {
            food.add("Ice-cream");
            food.add("Cupcake");
            food.add("Pastry");
            food.add("Browney");
            food.add("Choco Lava");
        }
        else if(types.equals("Drinks"))
        {
            food.add("Soft Drink");
            food.add("Mocktail");
            food.add("Mint Mojito");
            food.add("Cold Coffee");
            food.add("Ice Tea");
        }
        return food;
    }

}
