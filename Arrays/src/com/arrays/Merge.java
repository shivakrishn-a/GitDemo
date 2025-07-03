package com.arrays;

public class Merge {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {8, 9, 10, 11};
        int c[] = new int[a.length + b.length];

        // Copy elements from array 'a' to array 'c'
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy elements from array 'b' to array 'c'
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        // Display the merged array 'c'
        System.out.println("Merged Array:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
