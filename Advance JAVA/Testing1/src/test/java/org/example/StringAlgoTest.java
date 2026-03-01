package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringAlgoTest {



    StringAlgo stringAlgo = new StringAlgo();


    @Test
    void shift2Chars_normalString() {
        String result = stringAlgo.shift2Chars("program");
        assertEquals("ogrampr", result);
    }

    @Test
    void shift2Chars_smallString() {
        String result = stringAlgo.shift2Chars("hi");
        assertEquals("hi", result);
    }

    @Test
    void shift2Chars_emptyString() {
        String result = stringAlgo.shift2Chars("");
        assertEquals("", result);
    }

    @Test
    void shift2Chars_exactTwoChars() {
        String result = stringAlgo.shift2Chars("ab");
        assertEquals("ab", result);
    }
}
