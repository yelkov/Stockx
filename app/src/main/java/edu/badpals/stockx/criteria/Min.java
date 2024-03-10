package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;
import java.util.Optional;

public class Min implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(this.criteria,this.otherCriteria);
        Optional<Offer> minOffer = andCriteria.checkCriteria(item)
                .stream()
                .min(Offer::compareTo);
        return minOffer.isPresent()? List.of(minOffer.get()) : List.of();
    }
}
