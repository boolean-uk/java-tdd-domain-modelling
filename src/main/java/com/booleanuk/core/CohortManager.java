package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class CohortManager {
    List<String> cohorts;

    public CohortManager() {
        this.cohorts = new ArrayList<>();
        this.cohorts.add("Experis C# 1");
        this.cohorts.add("Experis C# 2");
        this.cohorts.add("Experis Java 1");
        this.cohorts.add("Experis Java 2");
    }

    public boolean search(String name) {
        return this.cohorts.contains(name);
    }
}
