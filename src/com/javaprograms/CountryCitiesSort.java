package com.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class CountryCitiesSort {
        public static void main(String[] args) {

            Map<String, String> capitalCities = new HashMap<>();
            capitalCities.put("England", "London");
            capitalCities.put("India", "New Dehli");
            capitalCities.put("Austria", "Wien");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("Norway", "Oslo"); // duplicate key, will overwrite
            capitalCities.put("USA", "Washington DC");
            capitalCities.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry ->
                            System.out.println(entry.getKey() + " -> " + entry.getValue())
                    );
        }
    }

