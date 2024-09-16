package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CohortManagerTest {

    //Example tests
    @Test
    public void testSayHello() {
        CohortManager cohortManager = new CohortManager();

        String message = cohortManager.sayHello("Nathan");
        Assertions.assertEquals("Hello, Nathan!", message);

        String message2 = cohortManager.sayHello("Nikolaos");
        Assertions.assertEquals("Hello, Nikolaos!", message2);

//      Basic tests above can be refactored into below
        String theName = "Dave";
        String message3 = cohortManager.sayHello(theName);
        String expected = "Hello, " + theName + "!";
        Assertions.assertEquals(expected, message3);
    }

    @Test
    public void testSearchReturnsTrueOrFalse() {
        CohortManager cohortManager = new CohortManager();
        ArrayList<String> cohorts = new ArrayList<>();

        //Test we get false back if array list is empty
        boolean result3 = cohortManager.search(cohorts, "JAEX1");
        Assertions.assertFalse(result3);

        cohorts.add("Class 9");
        cohorts.add("Class 10");
        cohorts.add("JAEX1");
        cohorts.add("C#EX1");

        //Test we get true back
        boolean result1 = cohortManager.search(cohorts, "JAEX1");
        Assertions.assertTrue(result1);

        //Test we get false back
        boolean result2 = cohortManager.search(cohorts, "C++EX1");
        Assertions.assertFalse(result2);

    }

}
