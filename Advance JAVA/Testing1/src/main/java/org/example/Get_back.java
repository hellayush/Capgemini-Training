package org.example;

import java.util.HashMap;
import java.util.Map;

public class Get_back {

    public static int sq(int n) {

        int original = n;
        int count = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        while (true) {

            int curr = 0;
            int temp = n;

            // sum of squares of digits
            while (temp != 0) {
                int d = temp % 10;
                curr += d * d;
                temp = temp / 10;
            }

            count++;

            if (curr == original) {
                return count;
            }

            // cycle detected
            if (mp.containsKey(curr)) {
                return -1;
            }

            mp.put(curr, 1);   // just mark visited

            n = curr;
        }
    }

    public static void main(String[] args) {

        int n = 14;
        int result = sq(n);
        System.out.println(result);
    }
}