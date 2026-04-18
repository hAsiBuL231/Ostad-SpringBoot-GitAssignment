package com.example.GitAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Person {
    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String address;
}