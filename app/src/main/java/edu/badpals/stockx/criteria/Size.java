package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;

public class Size implements Criteria{
    private String size = "";

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                    .stream()
                    .filter(o -> o.size()==this.size)
                    .toList();
    }
}
