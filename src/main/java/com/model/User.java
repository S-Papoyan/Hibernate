package com.model;

import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id_users;

    private String name;

    private String surname;

    private int age;

    private String email;

    private String password;

    private String verification_code;

}
