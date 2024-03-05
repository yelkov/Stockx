package edu.badpals.stockx.item;

public class Sneaker {
    private String style;
    private String name;
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
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

    public int getBid() {
        return bid;
    }

    public int getSale(){
        return this.sale;
    }
    public int getAsk() {
        return this.ask;
    }
    @Override
    public String toString(){
        return this.name + "\n\t\t" + this.style;
    }
}
