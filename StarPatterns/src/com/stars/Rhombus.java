package com.stars;

public class Rhombus {

    public static void main(String[] args) {


        // Top half of the rhombus

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the rhombus
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = 3; l >= i; l--) {  // Adjusted loop condition
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
