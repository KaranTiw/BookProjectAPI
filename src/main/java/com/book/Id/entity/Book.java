package com.book.Id.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "email")
    private String email;

    @Column(name = "mobile", nullable = false, length = 10)
    private String mobile;


    private String title;
    


    @Column(name = "price", nullable = false)
    private String price;



}