package com.example.patterns;

import com.example.patterns.controller.ClienteRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author falvojr
 */
@EnableFeignClients
@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
	}

}
