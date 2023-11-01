package com.luv2code.crudStudent;

import com.luv2code.crudStudent.dao.StudentDAO;
import com.luv2code.crudStudent.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudStudentApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create multiple student
		System.out.println("Creating new student object...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Doe", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Doe", "bonita@luv2code.com");

		//save student
		System.out.println("saving new student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "Paul@luv2code.com");

		//save student object
		System.out.println("saving new student");
		studentDAO.save(tempStudent);
		//display id of the saved student
		System.out.println("student saved, generated ID:" + tempStudent.getId());
	}
}
