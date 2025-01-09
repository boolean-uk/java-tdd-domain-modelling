package com.booleanuk.core;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CohortManagerTest {
    @Test
    public void searchForCohortThatExists() {
        // setup
        ArrayList<String> cohorts = new ArrayList<>(){{
            add("Robin");
            add("Mathias");
            add("Magnus");
            add("Jonas");
            add("Thomas");
        }};
        CohortManager manager = new CohortManager(cohorts);
        String name = "Robin";

        // execute and verify
        Assertions.assertTrue(manager.search(name));
    }

    @Test
    public void searchForCohortThatDoesNotExist() {
        // setup
        ArrayList<String> cohorts = new ArrayList<>(){{
            add("Robin");
            add("Mathias");
            add("Magnus");
            add("Jonas");
            add("Thomas");
        }};
        CohortManager manager = new CohortManager(cohorts);
        String name = "Andreas";

        // execute and verify
        Assertions.assertFalse(manager.search(name));
    }
}
