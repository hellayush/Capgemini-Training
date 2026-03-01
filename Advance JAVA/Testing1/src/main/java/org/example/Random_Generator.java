package org.example;

public class Random_Generator {
    public int[] getTenRandom()
    {
        int[] arr = new int[10];
        for(int i = 0 ;i<10 ; i++)
        {
            arr[i] = (int) (Math.random()*10)%10;
        }
        return arr;

    }

    public static void main(String[] args) {
        Random_Generator g = new Random_Generator();

        int[] arr1 =  g.getTenRandom();
        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println(arr1[i]  +" ");
        }
    }
}
