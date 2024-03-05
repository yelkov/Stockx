package edu.badpals.stockx.item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SneakerTest {

    @Test
    public void constructorTest() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        assertNotNull(sneaker);
        assertEquals("555088-105", sneaker.getStyle());
        assertEquals("Jordan 1", sneaker.getName());
    }
}