package com.gcit.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcit.lms.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
