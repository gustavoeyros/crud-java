package com.example.crudjava.controller;

import com.example.crudjava.food.Food;
import com.example.crudjava.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    @CrossOrigin(origins = "", allowedHeaders = "*")
    @GetMapping
    public List<Food> getAll(){
        return repository.findAll();
    }
}

