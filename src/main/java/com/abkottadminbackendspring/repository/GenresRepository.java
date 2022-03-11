package com.abkottadminbackendspring.repository;

import com.abkottadminbackendspring.model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<Genres,Long> {
}
