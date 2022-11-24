package com.example.backend.DailyBudget.Service;

import com.example.backend.DailyBudget.Model.DailyBudget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DailyBudgetService {

    //class field
    private final CrudRepository<DailyBudget, Long> repository;

    //constructor
    public DailyBudgetService(CrudRepository<DailyBudget, Long> repository) {this.repository = repository; }

    public Iterable<DailyBudget> findAll(){return repository.findAll();}

}
