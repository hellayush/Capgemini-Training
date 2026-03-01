package org.example;

public class StringAlgo {

  public static String shift2Chars(String str)
    {

        return str.substring(2) + str.substring(0,2);
    }

    static void main() {
        String s = "Hello";
        String p = shift2Chars(s);
        System.out.println("before - >" + s  + " After ->" + p);

    }
}
