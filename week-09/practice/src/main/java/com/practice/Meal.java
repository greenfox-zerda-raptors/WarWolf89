package com.practice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Created by almasics on 2016.12.30..
 */

@Entity
@Table(name = "meals")

public class Meal {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String type;

    public int calorie;

    public Meal() {

    }

    public Meal(int calorie, String type) {
        this.calorie = calorie;
        this.type = type;
    }

}
