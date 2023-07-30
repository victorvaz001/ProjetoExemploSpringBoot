package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informa que a classe está pronta para ser usada pelo Spring MVC para lidar com solicitações WEB
public class HelloController {
	
	@GetMapping("/") //Retorna os dados quando chamado no navegador
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
