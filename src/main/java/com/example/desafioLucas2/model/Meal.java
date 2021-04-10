package com.example.desafioLucas2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Meal {
    private String strMeal;
    private String strCategory;
    private String strArea;
    private String strMealThumb;
    private String strInstructions;
}
