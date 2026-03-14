package com.javaprograms;

public class LargestElement {
    public static void main(String[] args) {

        int[] numbers = {10, 35, 8, 25, 45, -4};
        int largest = 0;
        int small=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }
            if(numbers[i]<small) {
            	small=numbers[i];
            }
        }
            System.out.println("Largest element is: " + largest);
        System.out.println("smaalest element is: " + small);

    }
}
