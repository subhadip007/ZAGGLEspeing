package com.example.springproj1.dao;

import com.example.springproj1.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface expenseRepo extends JpaRepository<Expense,Integer> {
}
