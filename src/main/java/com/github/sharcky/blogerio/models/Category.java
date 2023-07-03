package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Bg_Category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer CategoryID;

    @Column(unique = true)
    public String CategoryName;

    @Column(columnDefinition = "text")
    public String CategoryDescription;
}
