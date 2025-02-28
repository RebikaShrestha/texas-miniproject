package com.texas.miniprojecta.repository;

import com.texas.miniprojecta.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Object getDepartmentById(long id);

}
