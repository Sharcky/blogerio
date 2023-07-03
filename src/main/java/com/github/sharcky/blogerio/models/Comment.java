package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Bg_Comment")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer CommentID;

    @Column(unique = true, nullable = false)
    public Integer UserCommentID;

    @Column(nullable = false)
    public Long CommentText;

}
