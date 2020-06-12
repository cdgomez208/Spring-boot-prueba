package com.bolsadeideas.springboot.backend.apirest.controllers;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.bolsadeideas.springboot.backend.apirest.models.entity.AreaTriangulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Circulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Numeros;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Pendiente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Promedio;
import com.bolsadeideas.springboot.backend.apirest.models.services.CalculadoraService;


@CrossOrigin
@RestController
@EnableWebMvc

//Clase para los servicio Rest 
@RequestMapping("/api")
public class CalculadoraRestController {

	@Autowired
	private CalculadoraService calculadoraService;

		
	
	@PostMapping("/calculadora/suma")
	@ResponseStatus(HttpStatus.OK)
	public double suma(@RequestBody Numeros numeros) {
		
		return calculadoraService.calculadoraSuma(numeros);
	}
	
	
	@PostMapping("/calculadora/resta")
	@ResponseStatus(HttpStatus.OK)
	public double resta(@RequestBody Numeros numeros) {
			
		return calculadoraService.calculadoraResta(numeros);

	}
	

	@PostMapping("/calculadora/multiplicar")
	@ResponseStatus(HttpStatus.OK)
	public double multiplicar(@RequestBody Numeros numeros) {
		
		return calculadoraService.calculadoraMultiplicacion(numeros);
	}

	
	@PostMapping("/calculadora/division")
	public double dividir(@RequestBody Numeros numeros) {
		
		return calculadoraService.calculadoraDivision(numeros);
	}
	
     
	@PostMapping("/calculadora/pendiente")
	public double pendiente (@RequestBody Pendiente pendiente) {
		
		return calculadoraService.calcularPendiente(pendiente);
	}
	
	
	
	@PostMapping("/calculadora/promedio")
	public double pendiente (@RequestBody Promedio promedio) {
		
		return calculadoraService.calcularPromedio(promedio);
	}
	
	
	@PostMapping("/calculadora/triangulo")
	public double pendiente (@RequestBody AreaTriangulo area) {
		
		return calculadoraService.calcularArea(area);
	}


	@PostMapping("/calculadora/circulo")
	public double pendiente (@RequestBody Circulo circulo) {
		
		return calculadoraService.calcularAreaCirculo(circulo);
	}
	
	
	
}
