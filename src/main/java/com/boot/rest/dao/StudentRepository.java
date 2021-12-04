package com.boot.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.boot.rest.Entities.Student;

@Component
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
