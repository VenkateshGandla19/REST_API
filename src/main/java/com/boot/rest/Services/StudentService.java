package com.boot.rest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.rest.Entities.Student;
import com.boot.rest.dao.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository studentRespository;
	private Optional<Student> student;
	
	//add student
	public Student addStudent(Student student) {
		Student result = this.studentRespository.save(student);
		return result;
	}
	
	//get all students
	public List<Student> getStudents(){
		List<Student> list = (List<Student>)this.studentRespository.findAll();
		return list;
	}
	
	//get student by id
	public String getStudentById(int id) {
		String student = null;
		try {
			student = this.studentRespository.findById(id).toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return student;
	}
	
	//update student
	public void updateStudent(Student student, int studentId) {
		student.setId(studentId);
		studentRespository.save(student);
	}
	
	//delete student
	public void deleteStudent(int studentId) {
		studentRespository.deleteById(studentId);
	}
	
	

}
