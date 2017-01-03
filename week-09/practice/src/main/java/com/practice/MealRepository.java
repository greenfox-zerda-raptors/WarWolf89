package com.practice;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by almasics on 2017.01.02..
 */
public interface MealRepository extends CrudRepository<Meal, Long> {
    List<Meal> findAll();
}
