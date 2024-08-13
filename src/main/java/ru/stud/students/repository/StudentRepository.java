package ru.stud.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stud.students.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);

    Student findByEmail(String email);
}
