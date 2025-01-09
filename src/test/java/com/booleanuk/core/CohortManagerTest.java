package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CohortManagerTest {

    @Test
    public void searchForCohortThatExists() {
        // 1. Setup
        CohortManager cohortManager = new CohortManager();
        ArrayList<String> cohorts = new ArrayList<>() {{
            add("JAEX1");
            add("JAEX2");
            add("JAEX3");
            add("JAEX4");
            add("JAEX5");
        }};
        String name = "JAEX5";

        // 2. Execute / 3. Verify
        Assertions.assertTrue(cohortManager.search(cohorts, name));
    }

    @Test
    public void searchForCohortThatDoesNotExist() {
        // 1. Setup
        CohortManager cohortManager = new CohortManager();
        ArrayList<String> cohorts = new ArrayList<>() {{
            add("JAEX1");
            add("JAEX2");
            add("JAEX3");
            add("JAEX4");
            add("JAEX5");
        }};
        String name = "JAEX6";

        // 2. Execute / 3. Verify
        Assertions.assertFalse(cohortManager.search(cohorts, name));
    }
}
