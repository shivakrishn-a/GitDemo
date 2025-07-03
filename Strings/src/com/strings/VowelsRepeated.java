package com.strings;

import java.util.Scanner;

public class VowelsRepeated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str = sc.nextLine();

        int count = 0;
        int n = str.length();

        char ch = 0;

        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels in the sentence is " + count);
        sc.close();
    }
}

