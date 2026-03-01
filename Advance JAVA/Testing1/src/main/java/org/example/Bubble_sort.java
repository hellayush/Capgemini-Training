package org.example;

public class Bubble_sort {
    public void sort(int[] arr)
    {


        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            }

    public static void main(String[] args) {
        Bubble_sort b = new Bubble_sort();
        int[] arr = {1,2,6,3,2,7,43};
        b.sort(arr);
    }
}
