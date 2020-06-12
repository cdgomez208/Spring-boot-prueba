package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.AreaTriangulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Circulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Numeros;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Pendiente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Promedio;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	//@Autowired
	//private IClienteDao clienteDao;



	@Override
	public double calculadoraSuma(Numeros numeros) {

		double	resultado = numeros.getNumeroUno()+numeros.getNumeroDo();
		return resultado;
	}

	@Override
	public double calculadoraDivision(Numeros numeros) {

		double	resultado = numeros.getNumeroUno()/numeros.getNumeroDo();

		return resultado;
	}

	@Override
	public double calculadoraMultiplicacion(Numeros numeros) {
		
	double	resultado =  numeros.getNumeroUno()*numeros.getNumeroDo();
		return resultado;
	}

	@Override
	public double calcularPendiente(Pendiente pendiente) {

		 

		 double	resultadoUno = pendiente.getyDos() - pendiente.getyUno();
		 double resultadoDos = pendiente.getxDos() - pendiente.getxUno() ;

		 double resultadoFinal = resultadoUno / resultadoDos;

		return resultadoFinal;
	}

	@Override
	public double calcularPromedio(Promedio promedio) {

		double resultado = (promedio.getNumeroUno() + promedio.getNumeroDos() + promedio.getNumeroTres()) / 3;

		return resultado;
	}

	@Override
	public double calcularArea(AreaTriangulo areaTriangulo) {
		double area = (areaTriangulo.getBase() * areaTriangulo.getAltura()) / 2;

		return area;
	}

	@Override
	public double calcularAreaCirculo(Circulo circulo) {

		double areaCirculo =  ((Math.pow(circulo.getRadio(), 2))*  Math.PI)     ;
		return areaCirculo;
	}

	@Override
	public double calculadoraResta(Numeros numeros) {

		double	resultado = numeros.getNumeroUno()-numeros.getNumeroDo();		
	
		return resultado;
	}

}
