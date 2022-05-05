package com.example.springproj1.dao;

import com.example.springproj1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepo extends JpaRepository<Users,Integer> {
    Users findUserByEmail(String u);
}
