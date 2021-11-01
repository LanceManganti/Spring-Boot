package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args ->  {
            Student marriam = new Student(
                    "Marriam",
                    "marriam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)

            );
            Student lance = new Student(
                    "Lance",
                    "lance.manganti@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 19)

            );
            repository.saveAll(
                    List.of(marriam, lance)
            );
        };
    }
}
