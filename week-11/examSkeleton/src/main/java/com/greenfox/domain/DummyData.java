package com.greenfox.domain;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by almasics on 2017.01.09..
 */
@Entity
@Table(name = "dummy_data")
public class DummyData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String data;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdOn;


    public DummyData() {
        this.createdOn = Calendar.getInstance();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Calendar getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Calendar createdOn) {
        this.createdOn = createdOn;
    }
}
