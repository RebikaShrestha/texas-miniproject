package com.texas.miniprojecta.services;

import com.texas.miniprojecta.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department saveDepartment(Department department);
List<Department> listAllDepartment();

    Optional<Department> findDepartmentById(long id);

    Department getDepartmentById(int id);

    Optional<Department> getDepartmentById(Long id);

    void deleteDepartment(Long id);

    Department updateDepartment(Department department);
void deleteDepartment(int id);

}
