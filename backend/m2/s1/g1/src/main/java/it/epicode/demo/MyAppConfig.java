package it.epicode.demo;

import it.epicode.demo.entities.Drink;
import it.epicode.demo.entities.Menu;
import it.epicode.demo.entities.Pizza;
import it.epicode.demo.entities.Topping;
import org.springframework.context.annotation.Bean;


import java.util.ArrayList;


public class MyAppConfig {

    @Bean(name = "cheese")
    Topping getCheese(){
        var cheese = new Topping("cheese",0.69,10);
        return cheese;
    }
    @Bean(name = "tomato")
    Topping getTomato(){
        var tomato = new Topping("Tomato", 0.69, 10);
        return tomato;
    }
    @Bean(name = "ham")
    Topping getHam(){
        var ham = new Topping("Ham", 0.69, 10);
        return ham;
    }
    @Bean(name = "salami")
    Topping getSalami(){
        var salami = new Topping("Salami", 0.69, 10);
        return salami;
    }




    @Bean(name = "margherita")
    Pizza getMargherita(){
        var toppings = new ArrayList<Topping>();
        toppings.add(getCheese());
        toppings.add(getTomato());
        var margherita = new Pizza("Margherita",5, 600, toppings );
        return margherita;
    }

    @Bean(name = "diavola")
    Pizza getDiavola(){
        var toppings = new ArrayList<Topping>();
        toppings.add(getCheese());
        toppings.add(getTomato());
        toppings.add(getSalami());
        var diavola = new Pizza("Diavola", 6, 700, toppings);
        return diavola;
    }

    @Bean(name = "cotto")
    Pizza getPizzaCotto(){
        var toppings = new ArrayList<Topping>();
        toppings.add(getTomato());
        toppings.add(getCheese());
        toppings.add(getHam());
        var cotto = new Pizza("Pizza Cotto", 6, 650, toppings);
        return cotto;
    }

    @Bean(name = "coca-cola")
    Drink getCocacola(){
        var cocacola = new Drink("Coca-cola", 1.50, 100);
        return cocacola;
    }

    @Bean(name = "fanta")
    Drink getFanta(){
        var fanta = new Drink("Fanta", 1.50, 100);
        return fanta;
    }

    @Bean(name = "water")
    Drink getWater() {
        var water = new Drink("Water", 1.50, 100);
        return water;
    }

    @Bean(name = "menu")
    Menu getMenu(){
        var menuPizze = new ArrayList<Pizza>();
        var menuToppings = new ArrayList<Topping>();
        var menuDrinks = new ArrayList<Drink>();

        menuPizze.add(getMargherita());
        menuPizze.add(getDiavola());
        menuPizze.add(getPizzaCotto());
        menuToppings.add(getCheese());
        menuToppings.add(getTomato());
        menuToppings.add(getHam());
        menuToppings.add(getSalami());
        menuDrinks.add(getCocacola());
        menuDrinks.add(getFanta());
        menuDrinks.add(getWater());

        var menu = new Menu(menuPizze,menuToppings,menuDrinks);
        return menu;
    }
}
