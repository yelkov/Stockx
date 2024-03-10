package edu.badpals.stockx.item.criteria;

import edu.badpals.stockx.criteria.*;
import edu.badpals.stockx.item.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {
    @Test
    public void andCriteriaTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("9.5", 900));
        sneaker.add(new Bid("9.5", 400));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("9.5", 899));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));
        sneaker.add(new Sale("6", 356));
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("9.5", 360));
        sneaker.add(new Sale("13", 372));

        Criteria bids = new Bids();
        Criteria size = new Size("9.5");
        Criteria maxBid = new Max(size, bids);
        assertEquals(900, maxBid.checkCriteria(sneaker).get(0).value());
        assertEquals("9.5", maxBid.checkCriteria(sneaker).get(0).size());

        Criteria asks = new Asks();
        Criteria anotherSize = new Size("13");
        Criteria maxAsk = new Max(asks, anotherSize);
        assertEquals(341, maxAsk.checkCriteria(sneaker).get(0).value());
        assertEquals("13", maxAsk.checkCriteria(sneaker).get(0).size());
    }
}
