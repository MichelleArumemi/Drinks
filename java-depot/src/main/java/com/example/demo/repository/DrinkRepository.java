package com.example.demo.repository;

import com.example.demo.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long>{
   //@Query("")
    // List<Drink> findDrinkByPriceGreaterThan(int price)
}

