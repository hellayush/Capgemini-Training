package org.example;


public class StringAlgo {

    public String shift2Chars(String str){

        int n = str.length();
        if(n<=2)  return str;
        return str.substring(2) + str.substring(0,2);
    }

    public static void main(String[] args) {
        String str = "";
        String str2= "program";

        StringAlgo obj = new StringAlgo();

        String res =  obj.shift2Chars(str);
        System.out.println(res);
    }
}

