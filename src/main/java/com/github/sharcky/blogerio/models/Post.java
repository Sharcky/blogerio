package com.github.sharcky.blogerio.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Bg_Post")
@Data
public class Post {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer PostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "UserID")
    public Usuario UserPostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CategoryID")
    public Category CategoryPostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "TagID")
    public Tag TagPostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CommentID")
    public Comment CommentPostID;

    public String PostTitle;

    public String PostContent;


}
