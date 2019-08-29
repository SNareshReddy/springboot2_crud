package com.naresh.services;

import java.util.List;

import com.naresh.entity.Student;

public interface StudentServices {

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	void deleteStudent(Student student);

	Student getStudentById(long id);

	List<Student> getAllStudents();

}
