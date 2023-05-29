package com.sandeepa.crudapp.repository;

import com.sandeepa.crudapp.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentDto,Long> {

//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<StudentDto> findStudentByEmail(String email);
}
