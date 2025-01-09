package com.booleanuk.core;

import java.util.ArrayList;

public class CohortManager {
    public boolean search(ArrayList<String> cohorts, String name) {
        return cohorts.contains(name);
    }
}
