package com.javaprograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondlargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,5,6);
        Integer secondLargest = list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second largest number is: " + secondLargest);

    }
}
