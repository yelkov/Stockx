package edu.badpals.stockx.item.criteria;

import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.criteria.Size;
import edu.badpals.stockx.item.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SizeTest {
    @Test
    public void sizeTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));
        sneaker.add(new Sale("6", 356));
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));

        Criteria size = new Size("9.5");
        List<Offer> sizeList = size.checkCriteria(sneaker);
        assertEquals(2, sizeList.size());
        assertEquals("9.5", sizeList.get(0).size());

    }
}