package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CohortManagerTest {
    @Test
    public void testContains(){
        CohortManager cH = new CohortManager();
        cH.add("milk", 6);
        Assertions.assertTrue(cH.contains("milk"));
    }
    @Test
    public void testAddTrue(){
        CohortManager cH = new CohortManager();
        Assertions.assertTrue(cH.add("milk", 6));
    }
    @Test
    public void testAddFalse(){
        CohortManager cH = new CohortManager();
        cH.add("milk", 6);
        Assertions.assertFalse(cH.add("milk", 6));
    }

    @Test
    public void testTotal(){
        CohortManager cH = new CohortManager();
        cH.add("milk", 6);
        cH.add("water", 10);
        cH.add("apple", 10);
        Assertions.assertEquals(26, cH.total());
    }

}