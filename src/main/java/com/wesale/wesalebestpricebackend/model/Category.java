package com.wesale.wesalebestpricebackend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="category")
@Data


public class Category {
    @Id
    Long id;
    String name;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
