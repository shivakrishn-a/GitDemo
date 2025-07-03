package com.arrays;

public class AddCommonElements {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b[] = {2, 4, 6, 8};

        // The result array should be of the same length as array b
        int c[] = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                // Compare elements at indices i and j
                if (a[i] == b[j]) {
                    c[j] = a[i] + b[j];
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
