package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bids implements Criteria{
    public Bids(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bids = new ArrayList<Offer>();
        for (Offer offer : item.offers()){
            if (offer instanceof Bid){
                bids.add(offer);
            }else{
                continue;}
        }
        bids.sort(Comparator.reverseOrder());

        return bids;
    }
}
