package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CohortManagerTest {
    @Test
    public void searchExistingItem() {
        CohortManager cohortmanager = new CohortManager();
        List<String> cohort = new ArrayList<>() {{
            add("a");
            add("b");
            add("c");
        }};
        assertTrue(cohortmanager.search(cohort, "a"));
    }

    @Test
    public void searchNonExistingItem() {
        CohortManager cohortmanager = new CohortManager();
        List<String> cohort = new ArrayList<>() {{
            add("a");
            add("b");
            add("c");
        }};
        assertFalse(cohortmanager.search(cohort, "d"));
    }
}
