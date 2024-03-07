package edu.badpals.stockx.item.criteria;

import edu.badpals.stockx.criteria.Asks;
import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AsksTest {

    @Test
    public void checkCriteria_asks_Test(){
        Sneaker sneaker = new Sneaker("555088-105","Jordan 1");
        sneaker.add(new Ask("5.5", 550));
        sneaker.add(new Ask("4.5", 480));
        sneaker.add(new Ask("5.5", 900));
        sneaker.add(new Ask("6", 472));

        Criteria asks = new Asks();

        List<Offer> filteredAsks = asks.checkCriteria(sneaker);
        assertTrue(filteredAsks.stream().allMatch(o -> o instanceof Ask));

        assertEquals(472, filteredAsks.get(0).value());

    }
}
