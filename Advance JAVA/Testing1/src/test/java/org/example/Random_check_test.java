package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Random_check_test {
    Random_Generator gg = new Random_Generator();

    @Test
    public void TestOnLarge() {
        int[] arr = gg.getTenRandom();
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i]<10,true);
        }
    }

    @Test
    public void TestOnSize(){
        int[] arr = gg.getTenRandom();

        int n = arr.length;

        assertEquals(10, n);
    }




}
