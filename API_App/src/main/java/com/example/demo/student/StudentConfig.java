package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
                StudentRepository repository){
        return args ->{
			Student Sam = new Student(
				1L,
				"Samoyla",
				LocalDate.of(2000, Month.AUGUST, 21),
				"samoyla@mail.com");

                Student Alex = new Student(
				2L,
				"Alex",
				LocalDate.of(2004, Month.MAY, 5),
				"alex@mail.com");

                repository.saveAll(
					List.of(Sam, Alex)
                );
        };
    }
}
