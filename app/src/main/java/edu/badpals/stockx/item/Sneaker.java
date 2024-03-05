package edu.badpals.stockx.item;

public class Sneaker {
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public Object getStyle(){
        return this.style;
    }
    public Object getName(){
        return this.name;
    }
}
