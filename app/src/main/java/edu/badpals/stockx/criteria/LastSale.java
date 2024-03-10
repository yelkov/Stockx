package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sale;

import java.util.List;
import java.util.Optional;

public class LastSale implements Criteria{

    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> lastSale = item.offers()
                                        .stream()
                                        .filter(o -> o instanceof Sale)
                                        .reduce((primero, segundo)->segundo);
        return lastSale.isPresent()? List.of(lastSale.get()) : List.of();
    }
}
