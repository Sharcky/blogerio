package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer CategoryID;
    @Column(unique = true)
    public String CategoryName;
    @Column
    public Long CategoryDescription;

    public Integer getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Integer categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Long getCategoryDescription() {
        return CategoryDescription;
    }

    public void setCategoryDescription(Long categoryDescription) {
        CategoryDescription = categoryDescription;
    }
}
