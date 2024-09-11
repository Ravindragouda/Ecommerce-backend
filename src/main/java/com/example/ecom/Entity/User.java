package com.example.ecom.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users") // 'user' can be a reserved keyword in some databases
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    // Assuming roles are stored as a comma-separated string
    @Column(nullable = false)
    private String role; // e.g., "ROLE_USER", "ROLE_ADMIN"


    // Constructors, Getters, Setters
}
