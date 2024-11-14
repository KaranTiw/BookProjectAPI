package com.book.Id.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;

   private String categoryTitle;

   private String categoryDescription;



}
