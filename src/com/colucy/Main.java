package com.colucy;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", 5.00, "Sausage", "Buffalo", true, true, true, true);
        double totalPrice = hamburger.burgerPrice();
        System.out.println("Total burger price is " + hamburger.burgerPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy", 6.50, "Brown rye", "Bacon", true, true, true, false, true, true);
        System.out.println("Total burger price is " + healthyBurger.burgerPrice());

        DeluxeBurger db = new DeluxeBurger();
        db.burgerPrice();
    }


}
