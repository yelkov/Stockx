package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{
    public Asks(){};

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(i -> i instanceof Ask)
                .sorted()
                .collect(Collectors.toList());
    }
}
