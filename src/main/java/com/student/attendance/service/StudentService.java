package com.student.attendance.service;

import com.student.attendance.entity.Student;
import com.student.attendance.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Student updateStudent(Long id, Student student) {

        Student existingStudent = repository.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setRollNumber(student.getRollNumber());
            existingStudent.setBranch(student.getBranch());
            existingStudent.setEmail(student.getEmail());

            return repository.save(existingStudent);
        }

        return null;
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}