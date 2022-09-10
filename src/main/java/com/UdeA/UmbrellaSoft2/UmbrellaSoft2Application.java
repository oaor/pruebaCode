package com.Udea.UmbrellaSoft2;

import com.Udea.UmbrellaSoft2.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})

public class UmbrellaSoft2Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo 3 Venceremos";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp = new Empresa("UmbrellaSoft", "Cra 24 32 56", "678678678", 3222222);
		emp.setNombre("UmbrellaSoft SAS");

		return emp.getNombre();
	}

	public static void main(String[] args) {

		SpringApplication.run(UmbrellaSoft2Application.class, args);

	}

}
