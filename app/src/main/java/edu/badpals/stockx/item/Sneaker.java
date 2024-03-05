package edu.badpals.stockx.item;

public class Sneaker implements Item {
    private String style;
    private String name;
    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }
}
