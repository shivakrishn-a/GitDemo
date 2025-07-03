package com.strings;

import java.util.Scanner;

public class LetterRepeated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine(); 

        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(ch + " is repeated for " + count + " times");
        sc.close();
    }
}
