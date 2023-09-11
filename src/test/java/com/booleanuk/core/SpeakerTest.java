package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeakerTest {

    @Test
    public void shouldSayHelloCorrectly(){
        Speaker speaker = new Speaker();

        String name = "Dave";
        String message = speaker.sayHello(name);
        Assertions.assertEquals("Hello, Dave!", message);

        Assertions.assertEquals("Hello, Nathan!", speaker.sayHello("Nathan"));
    }
}
