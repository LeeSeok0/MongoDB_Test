package com.example.documentdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class DocumentDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentDbApplication.class, args);
	}


}
