package com.loopnumbers;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num, rem, rev, temp;

        num = 56565;
        rem = 0;
        rev = 0;
        temp = num; // Store the original value of num

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        System.out.println("num = " + num);
        System.out.println("rev = " + rev);

        if (num == rev) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " not a palindrome");
        }
    }
}
