package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;

import java.util.logging.Level;

@Entity
public class User {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer UserID;

    @Column(nullable = false, length = 50)
    public String UserName;


    @Column(nullable = false, length = 50)
    public Level UserProfile;

    @Column(unique = true, nullable = false, length = 50)
    public String UserEmail;

    @Column(nullable = false, length = 50)
    public String UserPassword;

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Level getUserProfile() {
        return UserProfile;
    }

    public void setUserProfile(Level userProfile) {
        UserProfile = userProfile;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
