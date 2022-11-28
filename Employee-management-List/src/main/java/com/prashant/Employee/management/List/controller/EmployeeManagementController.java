package com.prashant.Employee.management.List.controller;

import com.prashant.Employee.management.List.model.EmployeeList;
import com.prashant.Employee.management.List.repo.EmployeeRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/EmployeeManage")
public class EmployeeManagementController {

    @Autowired
    private EmployeeRepo EmployeeRepo;

    @GetMapping
    public List<EmployeeList> findAll(){
        return EmployeeRepo.findAll();
    }

    @PostMapping
    public EmployeeList save(@NotNull @RequestBody EmployeeList EmployeeList){
      return EmployeeRepo.save(EmployeeList);
    }
}
