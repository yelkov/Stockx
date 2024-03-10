package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria{

    public MinAsk(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> minAsk = item.offers()
                .stream()
                .filter(a -> a instanceof Ask)
                .min(Comparator.naturalOrder());

        return minAsk.isPresent()? List.of(minAsk.get()): List.of();
    }
}
