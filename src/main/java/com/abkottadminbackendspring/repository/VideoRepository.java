package com.abkottadminbackendspring.repository;

import com.abkottadminbackendspring.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
