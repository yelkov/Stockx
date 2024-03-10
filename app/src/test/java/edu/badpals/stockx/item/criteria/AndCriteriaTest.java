package edu.badpals.stockx.item.criteria;

import edu.badpals.stockx.criteria.AndCriteria;
import edu.badpals.stockx.criteria.Criteria;
import edu.badpals.stockx.criteria.Sales;
import edu.badpals.stockx.criteria.Size;
import edu.badpals.stockx.item.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AndCriteriaTest {

    @Test
    public void andCriteriaTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("9.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));
        sneaker.add(new Sale("6", 356));
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("9.5", 360));
        sneaker.add(new Sale("13", 372));

        Criteria sales = new Sales();
        Criteria size = new Size("9.5");
        Criteria sizeAndSales = new AndCriteria(size, sales);
        List<Offer> filteredSizeAndSales = sizeAndSales.checkCriteria(sneaker);
        assertEquals(3, filteredSizeAndSales.size());
        assertEquals("9.5", filteredSizeAndSales.get(0).size());
        assertEquals(352, filteredSizeAndSales.get(0).value());

    }
}
