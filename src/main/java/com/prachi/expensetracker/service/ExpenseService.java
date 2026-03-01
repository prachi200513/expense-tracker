package com.prachi.expensetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.prachi.expensetracker.model.Expense;
import com.prachi.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;
    

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public void saveExpense(Expense expense) {
        repository.save(expense);
    }
    public void deleteExpense(Long id) {
    repository.deleteById(id);
}
    public double getTotalExpense() {
    return repository.findAll()
            .stream()
            .mapToDouble(Expense::getAmount)
            .sum();
}
}