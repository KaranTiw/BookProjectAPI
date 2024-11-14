package com.book.Id.controller;

import com.book.Id.entity.Category;
import com.book.Id.payload.CategoryDto;
import com.book.Id.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @PostMapping("/add")
    public String insertCaregory(@RequestBody CategoryDto categoryDto){
        categoryServiceImpl.createCategory(categoryDto);
    return "Successfully";
    }



}
