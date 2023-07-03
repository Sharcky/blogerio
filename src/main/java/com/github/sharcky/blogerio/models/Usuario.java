package com.github.sharcky.blogerio.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Bg_User")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer UserID;

    public String UserName;

    public String UserProfile;

    @Column(nullable = false, unique = true)
    public String UserEmail;

    @Column(nullable = false)
    public String UserPassword;

    public void setUserEmail(String userEmail) {
        if (userEmail == null || userEmail.isEmpty()) {
            throw new IllegalArgumentException("Usuario email cannot be null or empty");
        }

        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        if (!userEmail.matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        UserEmail = userEmail;
    }

}
