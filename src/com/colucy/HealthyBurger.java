package com.colucy;

public class HealthyBurger extends Hamburger {
    private boolean sprouts;
    private boolean carrots;

    public HealthyBurger(String name, double price, String bread, String meat, boolean lettuce, boolean tomato, boolean onion, boolean mayo, boolean sprouts, boolean carrots) {
        super("Healthy", price, "brown rye", meat, lettuce, tomato, onion, mayo);
        this.sprouts = sprouts;
        this.carrots = carrots;
    }

    @Override
    public double burgerPrice() {
        double hamburgerPrice = super.burgerPrice();
        if (sprouts == true) {
            hamburgerPrice += .50;
        }
        if (carrots == true) {
            hamburgerPrice += +.50;
        }
        return hamburgerPrice;
    }
}
