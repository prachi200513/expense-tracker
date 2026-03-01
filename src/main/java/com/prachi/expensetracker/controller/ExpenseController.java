package com.prachi.expensetracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.prachi.expensetracker.model.Expense;
import com.prachi.expensetracker.service.ExpenseService;

@Controller
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("expenses", service.getAllExpenses());
       
    
model.addAttribute("total", service.getTotalExpense());
    return "dashboard";
}
    

    @PostMapping("/add")
    public String addExpense(Expense expense) {
        service.saveExpense(expense);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
public String deleteExpense(@PathVariable Long id) {
    service.deleteExpense(id); 
    return "redirect:/";
    
}

}