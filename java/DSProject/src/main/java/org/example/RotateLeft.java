package org.example;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int position = 2;
        int n = arr.length;
        position = position % n;
        position = position % arr.length;

        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        reverse(arr, 0, position-1);  // Reverse the first part
        reverse(arr, position, n-1);  // Reverse the second part
        reverse(arr, 0, n - 1);

        Arrays.stream(arr).forEach(System.out::print);

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
