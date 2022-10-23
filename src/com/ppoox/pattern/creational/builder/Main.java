package com.ppoox.pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(45, 3)
                .calories(200)
                .fat(39)
                .sodium(20)
                .carbohydrate(10)
                .build();

        System.out.println(nutritionFacts.toString());
    }
}
