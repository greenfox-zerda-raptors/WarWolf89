package com.greenfoxacademy;

import lombok.AllArgsConstructor;

/**
 * Created by almasics on 2016.12.20..
 */
@AllArgsConstructor
public class Todo {


    int id;
    String title;
    boolean isUregnt = false;
    boolean isDone = false;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
