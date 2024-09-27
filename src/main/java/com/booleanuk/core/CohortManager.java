package com.booleanuk.core;

import java.util.List;
import java.util.Objects;

public class CohortManager {

    boolean search(List<String> cohorts, String name){
        return cohorts.contains(name);
    }

}
