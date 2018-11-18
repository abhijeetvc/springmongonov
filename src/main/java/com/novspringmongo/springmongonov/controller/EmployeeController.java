package com.novspringmongo.springmongonov.controller;

import com.novspringmongo.springmongonov.model.Employee;
import com.novspringmongo.springmongonov.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 17/11/18.
 */

@RestController
public class EmployeeController{

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/savedata")
    public String saveData(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "data saved";
    }
}
