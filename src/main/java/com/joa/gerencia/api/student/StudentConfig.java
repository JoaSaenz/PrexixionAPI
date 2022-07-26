/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joa.gerencia.api.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Joaquín
 */
@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//            Student joaquin = new Student("Joaquín", "joa@gmail.com", LocalDate.of(1990, Month.OCTOBER, 11));
//            Student mafer = new Student("Mafer", "mf@gmail.com", LocalDate.of(1994, Month.SEPTEMBER, 30));
//            
//            studentRepository.saveAll(List.of(joaquin, mafer));
//        };
//    }
}
