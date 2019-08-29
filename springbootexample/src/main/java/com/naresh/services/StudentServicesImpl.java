package com.naresh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.entity.Student;
import com.naresh.repository.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices{

	
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

	@Override
	public Student getStudentById(long id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
