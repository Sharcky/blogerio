package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;

@Entity
public class Comment {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer CommentID;
    @Column(unique = true, nullable = false)
    public Integer UserCommentID;
    @Column(unique = true, nullable = false)
    public Integer PostCommentID;
    @Column(nullable = false)
    public Long CommentText;

    public Integer getCommentID() {
        return CommentID;
    }

    public void setCommentID(Integer commentID) {
        CommentID = commentID;
    }

    public Integer getUserCommentID() {
        return UserCommentID;
    }

    public void setUserCommentID(Integer userCommentID) {
        UserCommentID = userCommentID;
    }

    public Integer getPostCommentID() {
        return PostCommentID;
    }

    public void setPostCommentID(Integer postCommentID) {
        PostCommentID = postCommentID;
    }

    public Long getCommentText() {
        return CommentText;
    }

    public void setCommentText(Long commentText) {
        CommentText = commentText;
    }
}
