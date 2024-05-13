package it.epicode.demo;


import java.util.List;

public class Menu {
    private List<Pizza> Pizze;
    private List<Topping> Toppings;
    private List <Drink> Drinks;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        Pizze = pizze;
        Toppings = toppings;
        Drinks = drinks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{\n");
        sb.append("Pizze=").append(Pizze);
        sb.append("\n Toppings=").append(Toppings);
        sb.append("\n  Drinks=").append(Drinks);
        sb.append("\n}");
        return sb.toString();
    }

}
