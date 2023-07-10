package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CohortManager {
    private final List<Cohort> cohorts;

    public CohortManager(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }

    public Optional<Cohort> search(String name) {
        return cohorts.stream()
                .filter(c -> c.name().equals(name))
                .findAny();
    }
}
