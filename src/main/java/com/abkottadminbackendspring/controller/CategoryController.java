package com.abkottadminbackendspring.controller;

import com.abkottadminbackendspring.model.Category;
import com.abkottadminbackendspring.model.Languages;
import com.abkottadminbackendspring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/category")
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService=new CategoryService();

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        return category;
    }

    @GetMapping("/get/{categoryId}")
    public Category getCategory(@PathVariable long categoryId){
        Category category=categoryService.getCategory(categoryId);
        return category;
    }

    @GetMapping("/")
    public List<Category> getAllCategories(){
        List<Category> categories=categoryService.getAllCategories();
        return categories;
    }

    @PostMapping("/update/{categoryId}")
    public Category updateCategory(@PathVariable long categoryId,@RequestBody Category category){
        category.setCategoryId(categoryId);
        Category newCategory=categoryService.updateCategory(category);
        return newCategory;
    }


    @GetMapping("/delete/{categoryId}")
    public void deleteCategory(@PathVariable long categoryId){
        categoryService.deleteCategory(categoryId);
    }

}
