package com.projeto.riea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.riea.model.Database;

@SpringBootApplication
public class RieaApplication {

	public static void main(String[] args) {
		Database.init();
		SpringApplication.run(RieaApplication.class, args);
	}

}
