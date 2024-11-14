package com.book.Id.service;

import com.book.Id.entity.Category;
import com.book.Id.payload.CategoryDto;
import com.book.Id.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;

@Service
public class CategoryServiceImpl {

    @Autowired
    private CategoryRepo categoryRepo;

@Autowired
    private ModelMapper  modelMapper;

public CategoryDto createCategory(CategoryDto categoryDto){
    Category category = this.modelMapper.map(categoryDto, Category.class);

    Category saveAdd = this.categoryRepo.save(category);
    return this.modelMapper.map(saveAdd, CategoryDto.class);



}

public CategoryDto updateCategory(CategoryDto categoryDto){
    Category category = this.modelMapper.map(categoryDto, Category.class);
    Category saveUpdate = this.categoryRepo.save(category);
    return this.modelMapper.map(saveUpdate, CategoryDto.class);
}





public String deleteCategory(int id){
    this.categoryRepo.deleteById(id);
    return "Category with id " + id + " deleted successfully";
}


public List<CategoryDto> getCotegory(){

    List<Category> cat = this.categoryRepo.findAll();

    return this.modelMapper.map(cat, List.class);

   }


}
