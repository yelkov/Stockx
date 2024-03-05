package edu.badpals.stockx.item;

public class Sale implements Offer{
    private String size;
    private Integer sale;

    public void sale(String size,Integer sale){
        this.size = size;
        this.sale = sale;
    }
    @Override
    public String size(){
        return this.size;
    }
    @Override
    public int value(){
        return this.sale;
    }
    @Override
    public int compareTo(Offer sale){
        return this.sale.compareTo(sale.value());
    }
}
