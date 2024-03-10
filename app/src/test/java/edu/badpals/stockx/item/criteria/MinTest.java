package edu.badpals.stockx.item.criteria;

import edu.badpals.stockx.criteria.*;
import edu.badpals.stockx.item.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinTest {
    @Test
    public void minTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("9.5", 900));
        sneaker.add(new Bid("9.5", 400));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("13", 670));
        sneaker.add(new Bid("9.5", 899));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 341));
        sneaker.add(new Sale("6", 356));
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("9.5", 360));
        sneaker.add(new Sale("13", 372));

        Criteria asks = new Asks();
        Criteria size = new Size("9.5");
        Criteria minAsk = new Min(asks, size);
        assertEquals(333, minAsk.checkCriteria(sneaker).get(0).value());
        assertEquals("9.5", minAsk.checkCriteria(sneaker).get(0).size());


        Criteria bids = new Bids();
        Criteria anotherSize = new Size("13");
        Criteria minBid = new Min(anotherSize, bids);
        assertEquals(670, minBid.checkCriteria(sneaker).get(0).value());
        assertEquals("13", minBid.checkCriteria(sneaker).get(0).size());
    }
}