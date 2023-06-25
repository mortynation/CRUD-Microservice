package com.morty.DepartmentService.Controller;

import com.morty.DepartmentService.Entity.Department;
import com.morty.DepartmentService.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/get/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        log.info("Inside getDepartment of DepartmentController");
        return departmentService.getDepartment(id);
    }
}
