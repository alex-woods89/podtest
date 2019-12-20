package com.PODFather.PODFather;


import com.PODFather.PODFather.models.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ItemTest {

    Item item;


    @Before
    public void setUp(){
         item = new Item("Acme Waste", "Left Over City", 2019, 3, "Sewage", 134, 112);

    }

    @Test
    public void hasName(){
        assertEquals("Acme Waste", item.getCustomer());
    }

    @Test
    public void hasSite(){
        assertEquals("Left Over City",  item.getSite());

    }

    @Test
    public void hasYear(){
        assertEquals(2019, item.getYear());
    }

}
