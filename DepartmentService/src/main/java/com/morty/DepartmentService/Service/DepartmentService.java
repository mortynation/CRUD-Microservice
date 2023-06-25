package com.morty.DepartmentService.Service;

import com.morty.DepartmentService.Entity.Department;
import com.morty.DepartmentService.Respository.DepartmentDatabase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentDatabase departmentDatabase;

    public Department saveDepartment(Department department){
        log.info("Inside saveDepartment of DepartmentService");
        return departmentDatabase.save(department);
    }

    public Optional<Department> getDepartment(Long id){
        log.info("Inside getDepartment of DepartmentService");
        return departmentDatabase.findById(id);
    }

}
