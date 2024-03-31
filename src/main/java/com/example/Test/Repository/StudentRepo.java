package com.example.Test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Test.Entities.Student;

public interface StudentRepo extends JpaRepository<Student, String>{

}
