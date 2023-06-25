package com.morty.DepartmentService.Respository;

import com.morty.DepartmentService.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentDatabase extends JpaRepository<Department, Long> {
    Optional<Department> findById(Long id);


}
