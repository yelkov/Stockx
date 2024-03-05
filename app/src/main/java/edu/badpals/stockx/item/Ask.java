package edu.badpals.stockx.item;

public class Ask implements Offer{
    private String size;
    private Integer ask;

    public Ask(String size,Integer ask){
        this.size = size;
        this.ask = ask;
    }
    @Override
    public String size(){
        return this.size;
    }
    @Override
    public int value(){
        return this.ask;
    }
    @Override
    public int compareTo(Offer ask){
        return this.ask.compareTo(ask.value());
    }
}
