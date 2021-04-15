package com.example.desafioLucas2.controller;

import com.example.desafioLucas2.model.Meal;
import com.example.desafioLucas2.model.Response;
import com.example.desafioLucas2.service.FetchMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class GetMealController {

    @Autowired
    private FetchMealService fetchMealService;

    @GetMapping("/meal/{mealName}")
    public ResponseEntity<Meal[]> getMeal(@PathVariable String mealName) {
        Response meals = this.fetchMealService.fetchMeals(mealName);
        Meal[] mealList = meals.meals;
        return ResponseEntity.ok(mealList);
    }
}
