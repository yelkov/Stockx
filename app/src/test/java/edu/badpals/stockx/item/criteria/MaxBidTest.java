package edu.badpals.stockx.item.criteria;

import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.criteria.MaxBid;
import edu.badpals.stockx.item.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MaxBidTest {
    @Test
    public void maxBidTest(){
        Item sneaker = new Sneaker("555088-105","Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria maxBid = new MaxBid();
        List<Offer> filteredMaxBid = maxBid.checkCriteria(sneaker);
        assertTrue(filteredMaxBid.stream().allMatch(o -> o instanceof Bid));

        assertEquals(900,filteredMaxBid.get(0).value());

    }

}
