package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CohortManagerTest {
    @Test
    void shouldReturnNonEmptyOptionalForPresentCohort() {
        var expectedCohort = new Cohort("test_cohort");
        var cohortManager = new CohortManager(List.of(expectedCohort));

        var cohortOpt = cohortManager.search("test_cohort");

        assertTrue(cohortOpt.isPresent());
        assertEquals(expectedCohort, cohortOpt.get());
    }

    @Test
    void shouldReturnEmptyOptionalForAbsentCohort() {
        var cohortManager = new CohortManager(List.of());

        var cohortOpt = cohortManager.search("test_cohort");

        assertTrue(cohortOpt.isEmpty());
    }
}
