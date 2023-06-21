package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Tag {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer TagID;
    @Column(unique = true, nullable = false, length = 100)
    public String TagName;

    @OneToMany(mappedBy = "TagPostID", cascade = CascadeType.ALL)
    public Set<Post> postSet;

    public Integer getTagID() {
        return TagID;
    }

    public void setTagID(Integer tagID) {
        TagID = tagID;
    }

    public String getTagName() {
        return TagName;
    }

    public void setTagName(String tagName) {
        TagName = tagName;
    }

    public Set<Post> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }

}
