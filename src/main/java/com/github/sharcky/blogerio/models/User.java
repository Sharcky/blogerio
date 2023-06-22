package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Bg_User")
public class User {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer UserID;

    public String UserName;

    public String UserProfile;

    @Column(nullable = false, unique = true)
    public String UserEmail;

    @Column(nullable = false)
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

    public String getUserProfile() {
        return UserProfile;
    }

    public void setUserProfile(String userProfile) {
        UserProfile = userProfile;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        if (userEmail == null || userEmail.isEmpty()) {
            throw new IllegalArgumentException("User email cannot be null or empty");
        }

        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        if (!userEmail.matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
