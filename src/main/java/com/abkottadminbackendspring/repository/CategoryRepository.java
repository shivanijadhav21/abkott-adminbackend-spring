package com.abkottadminbackendspring.repository;

import com.abkottadminbackendspring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
