package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{
    Criteria criteria;
    Criteria otherCriteria;
    public AndCriteria(Criteria criteria, Criteria otherCriteria){
            this.criteria = criteria;
            this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstFilter = criteria.checkCriteria(item);
        List<Offer> secondFilter = otherCriteria.checkCriteria(item);
        return firstFilter.stream()
                .filter(o -> secondFilter.contains(o))
                .toList();
    }
}
