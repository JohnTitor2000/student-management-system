package com.javaproject.studentmanagementsystem.service.impl;

import com.javaproject.studentmanagementsystem.entity.Student;
import com.javaproject.studentmanagementsystem.repository.StudentRepository;
import com.javaproject.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
