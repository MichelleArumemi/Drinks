package com.example.demo.services;

import com.example.demo.domain.Drink;

import java.util.List;

public interface DrinkService {
    //    interfaces have no body because they are abstracts
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
    void deleteDrink(long id);
}
