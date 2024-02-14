package com.demo.demo.repository;

import com.demo.demo.dbentity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies,Long> {
}
