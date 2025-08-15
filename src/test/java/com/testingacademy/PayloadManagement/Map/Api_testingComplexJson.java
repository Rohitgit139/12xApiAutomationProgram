package com.testingacademy.PayloadManagement.Map;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Api_testingComplexJson {

    public static void main(String[] args) throws Exception {
        List<LinkedHashMap<String, Object>> fruits = new ArrayList<>();

        // Apple
        Map<String, Object> apple = new LinkedHashMap<>();
        apple.put("name", "Apple");
        apple.put("color", "#FF0000");

        Map<String, String> appleDetails = new LinkedHashMap<>();
        appleDetails.put("type", "Pome");
        appleDetails.put("season", "Fall");
        apple.put("details", appleDetails);

        Map<String, Object> appleNutrients = new LinkedHashMap<>();
        appleNutrients.put("calories", 52);
        appleNutrients.put("fiber", "2.4g");
        appleNutrients.put("vitaminC", "4.6mg");
        apple.put("nutrients", appleNutrients);

        fruits.add((LinkedHashMap<String, Object>) apple);

        // Banana
        Map<String, Object> banana = new LinkedHashMap<>();
        banana.put("name", "Banana");
        banana.put("color", "#FFFF00");

        Map<String, String> bananaDetails = new LinkedHashMap<>();
        bananaDetails.put("type", "Berry");
        bananaDetails.put("season", "Year-round");
        banana.put("details", bananaDetails);

        Map<String, Object> bananaNutrients = new LinkedHashMap<>();
        bananaNutrients.put("calories", 89);
        bananaNutrients.put("fiber", "2.6g");
        bananaNutrients.put("potassium", "358mg");
        banana.put("nutrients", bananaNutrients);

        fruits.add((LinkedHashMap<String, Object>) banana);

        // Orange
        Map<String, Object> orange = new LinkedHashMap<>();
        orange.put("name", "Orange");
        orange.put("color", "#FFA500");

        Map<String, String> orangeDetails = new LinkedHashMap<>();
        orangeDetails.put("type", "Citrus");
        orangeDetails.put("season", "Winter");
        orange.put("details", orangeDetails);

        Map<String, Object> orangeNutrients = new LinkedHashMap<>();
        orangeNutrients.put("calories", 47);
        orangeNutrients.put("fiber", "2.4g");
        orangeNutrients.put("vitaminC", "53.2mg");
        orange.put("nutrients", orangeNutrients);

        fruits.add((LinkedHashMap<String, Object>) orange);

        // Wrapping in a parent map
        Map<String, Object> fruitMap = new LinkedHashMap<>();
        fruitMap.put("fruits", fruits);

        System.out.println(fruitMap);
    }
}
