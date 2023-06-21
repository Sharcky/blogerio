package com.github.sharcky.blogerio.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer PostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "UserID")
    public User UserPostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CategoryID")
    public Category CategoryPostID;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "TagID")
    public Tag TagPostID;

    public String PostTitle;

    public String PostContent;

    /* GET & SET ---------------------------------------------- */

    public Integer getPostID() {
        return PostID;
    }

    public void setPostID(Integer postID) {
        PostID = postID;
    }

    public User getUserPostID() {
        return UserPostID;
    }

    public void setUserPostID(User userPostID) {
        UserPostID = userPostID;
    }

    public Category getCategoryPostID() {
        return CategoryPostID;
    }

    public void setCategoryPostID(Category categoryPostID) {
        CategoryPostID = categoryPostID;
    }

    public Tag getTagPostID() {
        return TagPostID;
    }

    public void setTagPostID(Tag tagPostID) {
        TagPostID = tagPostID;
    }

    public String getPostTitle() {
        return PostTitle;
    }

    public void setPostTitle(String postTitle) {
        PostTitle = postTitle;
    }

    public String getPostContent() {
        return PostContent;
    }

    public void setPostContent(String postContent) {
        PostContent = postContent;
    }
}
