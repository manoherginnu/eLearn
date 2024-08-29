package org.example;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        int n = arr.length;
        int position = 5;
        reverse(arr,0,n-1);
        reverse(arr,0,position-1);
        reverse(arr,position,n-1);

        Arrays.stream(arr).forEach(System.out::print);

    }

    private static void reverse(int[] arr, int start, int end) {

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
