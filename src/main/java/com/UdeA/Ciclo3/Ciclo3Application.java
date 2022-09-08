package com.UdeA.Ciclo3;

import com.UdeA.Ciclo3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo 3... Saldremos vivos de ésto!!";
	}

	@GetMapping("/test")
	public String test(){

		Empresa emp = new Empresa("SOLAR SAS", "Calle la jeta","3213213211", "900899754-2");
		emp.setNombre("SOLAR LTDA");
		//System.out.printf("Aquí ya se creó la empresa y se renombró");
		return emp.getNombre();


	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
