package com.example.Springboot_api_db;

import com.example.Springboot_api_db.topic.TopicRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })//scanBasePackages={"com.example.Springboot_api_db","com.example.Springboot_api_db.topic"})
//@EnableMongoRepositories(basePackageClasses = TopicRepository.class)
public class SpringbootApiDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiDbApplication.class, args);
	}

}
