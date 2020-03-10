package com.hcl.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hcl.demo.entiy.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	 Optional<Employee> findById(Integer id);

	 @Query("SELECT t FROM  Employee t where t.locationName = :locationName")
	  public Optional<Employee> findByLocation(@Param("locationName") String locationName);
	 
}
