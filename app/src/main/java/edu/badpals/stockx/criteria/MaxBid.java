package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria{

    public MaxBid(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> maxBid = item.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .max(Offer::compareTo);
        return maxBid.isPresent()? List.of(maxBid.get()) : List.of();
    }
}
