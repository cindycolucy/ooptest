package com.colucy;

public class Hamburger {
    private String name;
    private double price = 5.00;
    private String bread;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean mayo;

    public Hamburger(String name, double price, String bread, String meat, boolean lettuce, boolean tomato, boolean onion, boolean mayo) {
        this.name = name;
        this.price = price;
        this.bread = bread;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.mayo = mayo;
    }

    public double getPrice() {
        return price;
    }

    public double burgerPrice() {
        double totalPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.bread + " roll price is " + this.price);
        if (lettuce == true){
            totalPrice += .50;
        }
        if (tomato == true){
            totalPrice += + .50;
        }
        if (onion == true){
            totalPrice += + .50;
        }
        if (mayo == true){
            totalPrice += + .50;
        }
        return totalPrice;

    }
}
