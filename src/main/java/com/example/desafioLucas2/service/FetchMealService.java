package com.example.desafioLucas2.service;

import com.example.desafioLucas2.model.Meal;
import com.example.desafioLucas2.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FetchMealService {

    @Autowired
    private WebClient webClient;

    public Response fetchMeals(String mealName) {
        Mono<Response> monoMeals = this.webClient
                .method(HttpMethod.GET)
                .uri("search.php?s={mealName}", mealName)
                .retrieve()
                .bodyToMono(Response.class);

        Response meals = monoMeals.block();


        return meals;
    }
}
