package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sale;

import java.util.List;

public class Sales implements Criteria{

    public Sales(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(o -> o instanceof Sale)
                .toList();
    }
}
