package com.bolsadeideas.springboot.backend.apirest.models.entity;


//request para el area del triangulo
public class AreaTriangulo {

	private double base;
	
	private double altura;

	
	public AreaTriangulo() {
    	super();
    }
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
