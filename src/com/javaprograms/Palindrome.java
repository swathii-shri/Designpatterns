package com.javaprograms;

public class Palindrome {

    public static void main(String[] args) {

    }
        // Method to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            // Remove spaces and convert to lowercase
            String cleaned = str.replaceAll("\\s+", "");

            // Check if the string reads the same forwards and backwards
            int left = 0;
            int right = cleaned.length() - 1;

            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }



