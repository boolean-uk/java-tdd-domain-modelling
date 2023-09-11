package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CohortManagerTest {
    @Test
    public void searchWorksCorrectly() {
        CohortManager cohortManager = new CohortManager();

        Assertions.assertTrue(cohortManager.search("Experis Java 2"));
        Assertions.assertFalse(cohortManager.search(""));
        Assertions.assertFalse(cohortManager.search("Cohort 11"));
    }
}
