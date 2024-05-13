package it.epicode.demo;


import java.util.List;

public class Pizza extends MenuItem {
    List<Topping> Toppings;

    public Pizza(String name, double price, int calories, List<Topping> toppings) {
        super(name, price, calories);
        Toppings = toppings;
    }

    public List<Topping> getToppings() {
        return Toppings;
    }

    public void setToppings(List<Topping> toppings) {
        Toppings = toppings;
    }
}
