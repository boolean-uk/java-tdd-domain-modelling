package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CohortManagerTest {
    // One way of doing it
    /*
    CohortManager cohortManager;

    public CohortManagerTest(){
        this.cohortManager = new CohortManager();
    }
    */

    // Another way of doing it
    ArrayList<String> cohorts;

    public CohortManagerTest(){
        this.cohorts = new ArrayList<>();
        this.cohorts.add("Something");
        this.cohorts.add("Some2");
    }

    @Test
    public void testSearchExists(){
        CohortManager cohortManager = new CohortManager();
        Assertions.assertFalse(cohortManager.search(cohorts, ""));
    }

    @Test
    public void testSearchFindName(){
        CohortManager cohortManager = new CohortManager();
        Assertions.assertTrue(cohortManager.search(cohorts, "Some2"));
        Assertions.assertFalse(cohortManager.search(cohorts, "Some3"));
    }



}
