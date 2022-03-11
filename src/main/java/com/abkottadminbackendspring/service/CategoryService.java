package com.abkottadminbackendspring.service;

import com.abkottadminbackendspring.model.Category;
import com.abkottadminbackendspring.model.Languages;
import com.abkottadminbackendspring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category addCategory(Category category){
        Category newCategory=categoryRepository.save(category);
        return newCategory;
    }

    public Category getCategory(Long categoryId){
        Category category=categoryRepository.findById(categoryId).orElse(null);
        return category;
    }

    public List<Category> getAllCategories(){
        List<Category> categories=categoryRepository.findAll();
        return categories;
    }

        public Category updateCategory(Category category){
        if (category!=null) {
            Category existingCategory = new Category();
            existingCategory.setCategoryId(category .getCategoryId());
            existingCategory.setCategory(category.getCategory());

            categoryRepository.save(existingCategory);
            return existingCategory;
        }
        else {
            return null;
        }
    }

    public void deleteCategory(long categoryId){
        categoryRepository.deleteById(categoryId);
    }

}
