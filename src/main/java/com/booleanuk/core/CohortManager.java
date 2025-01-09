package com.booleanuk.core;

import java.util.ArrayList;

public class CohortManager {
    private ArrayList<String> cohorts;

    public CohortManager(ArrayList<String> cohorts) {
        this.cohorts = cohorts;
    }

    boolean search(String name) {
        return cohorts.contains(name);
    }
}