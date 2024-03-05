package edu.badpals.stockx.item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AskTest {

    @Test
    public void constructorTest(){
        Ask ask = new Ask("9.5",300);
        assertNotNull(ask);
        assertEquals("9.5",ask.size());
        assertEquals(300,ask.value());
    }
}
