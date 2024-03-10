package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(this.criteria,this.otherCriteria);
        Optional<Offer> filteredOffers = andCriteria.checkCriteria(item)
                .stream()
                .max(Offer::compareTo);
        return filteredOffers.isPresent()? List.of(filteredOffers.get()) : List.of();
    }
}
