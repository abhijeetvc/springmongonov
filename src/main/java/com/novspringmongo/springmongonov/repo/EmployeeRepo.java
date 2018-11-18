package com.novspringmongo.springmongonov.repo;

import com.novspringmongo.springmongonov.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by abhi on 17/11/18.
 */


public interface EmployeeRepo extends MongoRepository<Employee,String> {


}
