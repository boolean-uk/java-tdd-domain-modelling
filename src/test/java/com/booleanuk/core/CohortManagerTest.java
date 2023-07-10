package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CohortManagerTest {

    @Test
    public void testSearchReturnsFalse() {
        CohortManager cohortManager = new CohortManager();
        List<String> cohorts = new ArrayList<>();
        cohorts.add("jaex1");
        cohorts.add("class10");
        String name = "jna6ex1";
        boolean result = cohortManager.search(cohorts, name);
        Assertions.assertFalse(result);
    }

    @Test
    public void testSearchReturnsTrue() {
        CohortManager cohortManager = new CohortManager();
        List<String> cohorts = new ArrayList<>();
        cohorts.add("jna6ex1");
        cohorts.add("jaex1");
        cohorts.add("class10");
        String name = "jna6ex1";
        boolean result = cohortManager.search(cohorts, name);
        Assertions.assertTrue(result);
    }
}
