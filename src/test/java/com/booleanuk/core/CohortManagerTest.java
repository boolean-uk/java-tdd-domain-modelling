package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CohortManagerTest {

    @Test
    public void testSayHello() {
        CohortManager cohortManager = new CohortManager();

        String theName = "Nathan";
        String message3 = cohortManager.sayHello(theName);
        String expected = "Hello, " + theName + "!";
        Assertions.assertEquals(expected, message3);
    }
    @Test
    public void testSearch() {
        CohortManager cohortManager = new CohortManager();

        List<String> cohorts = new ArrayList<String>();

        cohorts.add("JAEX");
        cohorts.add("C#");
        boolean isContained = cohortManager.search(cohorts,"JAEX");
        Assertions.assertEquals(true, isContained);
        boolean isNotContained = cohortManager.search(cohorts,"Java");
        Assertions.assertEquals(false, isNotContained);
        boolean isContainedCSharp = cohortManager.search(cohorts,"C#");
        Assertions.assertEquals(true, isContainedCSharp);
    }
}
