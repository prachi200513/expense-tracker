package com.prachi.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prachi.expensetracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}