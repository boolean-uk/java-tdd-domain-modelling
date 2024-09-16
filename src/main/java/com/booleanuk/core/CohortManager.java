package com.booleanuk.core;

import java.util.ArrayList;

public class CohortManager {

    //sayHello example
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    public boolean search(ArrayList<String> cohorts, String name) {
        return cohorts.contains(name);
    }



}
