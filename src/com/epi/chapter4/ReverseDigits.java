package com.epi.chapter4;

/**
 * Write a program that takes an integer and returns the integer corresponding to the digits of the input written in reverse order.
 */
public class ReverseDigits {

    public static void main(String[] args) {
        System.out.println("Reversed digit is "+reverseDigits(-15));
    }

    private static int reverseDigits(int digitToReverse) {
        int result = 0;
        int remaining = Math.abs(digitToReverse);
        while(remaining > 0) {
            result = result*10 + remaining%10;
            remaining = remaining/10;
        }
        return digitToReverse < 0 ? -result : result;

    }
}
