package com.example.desafioLucas2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Response {
    private List<Meal> meals;

    public Response() {
    }

}
