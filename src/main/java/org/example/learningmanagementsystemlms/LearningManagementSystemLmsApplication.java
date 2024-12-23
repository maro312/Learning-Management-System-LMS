package org.example.learningmanagementsystemlms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LearningManagementSystemLmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearningManagementSystemLmsApplication.class, args);
//		System.out.println("why?");
	}

}
