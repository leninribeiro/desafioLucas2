package com.example.desafioLucas2.controller;

import com.example.desafioLucas2.model.Response;
import com.example.desafioLucas2.service.FetchMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMealController {

    @Autowired
    private FetchMealService fetchMealService;

    @GetMapping("/meal/{mealName}")
    public ResponseEntity<Response> getMeal(@PathVariable String mealName) {
        Response meals = this.fetchMealService.fetchMeals(mealName);
        return ResponseEntity.ok(meals);
    }
}
