package com.example.springproj1.dao;

import com.example.springproj1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface categoryRepo extends JpaRepository<Category,Integer> {
}
