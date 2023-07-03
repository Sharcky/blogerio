package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Data
@Entity
@Table(name = "Bg_Tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer TagID;

    @Column(unique = true, nullable = false, length = 100)
    public String TagName;
}
