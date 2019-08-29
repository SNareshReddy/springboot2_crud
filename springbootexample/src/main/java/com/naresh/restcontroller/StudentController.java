package com.naresh.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.entity.Student;
import com.naresh.services.StudentServices;

@RestController
public class StudentController {

	@Autowired
	StudentServices studentServices;
	
	@PostMapping("/savestudent")
	public Student saveStudentDetails(@RequestBody Student student) {
		
		return studentServices.saveStudent(student);
	}
	
	@GetMapping("/viewstudents")
	public List<Student> retrieveAllStudents(){
		
		return studentServices.getAllStudents();
	}
	
	@GetMapping("/viewstudent/{id}")
	public Student getStudent(@PathVariable long id) {
		
		return studentServices.getStudentById(id);
	}
	
	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student student) {
		
		return studentServices.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable long id) {
		Student student = studentServices.getStudentById(id);
		studentServices.deleteStudent(student);
		return "deleted student with id="+id;
	}
}
