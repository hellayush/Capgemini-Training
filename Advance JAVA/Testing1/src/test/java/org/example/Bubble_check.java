package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Bubble_check {
    Bubble_sort bb = new Bubble_sort();

    @Test
    void checklong()
    {
        int[] sd = {1,3,4,2,5};
        int[] res = {1,2,3,4,5};
    bb.sort(sd);
        assertArrayEquals(res,sd);
    }

}
