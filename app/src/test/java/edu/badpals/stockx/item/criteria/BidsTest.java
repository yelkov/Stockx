package edu.badpals.stockx.item.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import edu.badpals.stockx.criteria.Bids;
import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;
import org.junit.Test;


public class BidsTest {

    @Test
    public void checkCriteria_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));

        Criteria bids = new Bids();

        List<Offer> filteredBids = bids.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(b -> b instanceof Bid));
    }
}