package com.boot.rest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.Entities.Student;
import com.boot.rest.Services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		Student s = this.studentService.addStudent(student);
		System.out.println("Student added: " +s);
		return s;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return this.studentService.getStudents();
		
	}

	
	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable("id") int id)
	{
		return studentService.getStudentById(id);
	}

		
	@PutMapping("/students/{studentId}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("studentId") int studentId)
	{
		this.studentService.updateStudent(student, studentId);
		return student;
	}
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable("studentId") int studentId)
	{
		this.studentService.deleteStudent(studentId);
		System.out.println("Deleted Student: " +studentId);
	}
	
}
