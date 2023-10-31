package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents(){
		return List.of(
			new Student(
				1L,
				"Samoyla",
				23,
				LocalDate.of(2000, Month.AUGUST, 21),
				"samoyla@mail.com"));
	}
}
