package com.booleanuk.core;

import java.util.List;

public class CohortManager {
    public String sayHello(String name){

        return "Hello, " +name+"!";
    }

    public boolean search(List<String> cohorts, String cohortToSearch) {
        for(String cohortName: cohorts){
            if(cohortName.equals(cohortToSearch)){
                return true;
            }
        }
        return false;
    }
}
