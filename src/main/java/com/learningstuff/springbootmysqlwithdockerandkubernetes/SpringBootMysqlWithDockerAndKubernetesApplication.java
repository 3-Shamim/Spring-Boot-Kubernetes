package com.learningstuff.springbootmysqlwithdockerandkubernetes;

import com.learningstuff.springbootmysqlwithdockerandkubernetes.models.Student;
import com.learningstuff.springbootmysqlwithdockerandkubernetes.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootMysqlWithDockerAndKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMysqlWithDockerAndKubernetesApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.save(new Student(1, "John Doe", "Demo home", 4.0));
        };
    }

}
