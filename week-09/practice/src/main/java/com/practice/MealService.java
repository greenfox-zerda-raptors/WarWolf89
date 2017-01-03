package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by almasics on 2017.01.03..
 */
@Service
public class MealService {

    private MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> list() {
        return mealRepository.findAll();
    }

    public Meal get(Long id) {
        return mealRepository.findOne(id);
    }

    public Meal save(Meal meal) {
        return mealRepository.save(meal);
    }

}
