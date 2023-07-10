package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CohortManagerTest {
    @Test
    void testSearch( ){
        CohortManager cohortManager = new CohortManager();
        List<String> cohorts = new ArrayList<>();
        cohorts.add("Yes");
        cohorts.add("yo");
        
        Assertions.assertTrue(cohortManager.search(cohorts,"Yes"));
        Assertions.assertFalse(cohortManager.search(cohorts,"no"));

    }

}
