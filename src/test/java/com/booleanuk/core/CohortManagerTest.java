package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CohortManagerTest {
    @Test
    public void testAdd(){
        CohortManager cH = new CohortManager();
        cH.add("milk", 6);
        Assertions.assertTrue(cH.contains("milk"));
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
