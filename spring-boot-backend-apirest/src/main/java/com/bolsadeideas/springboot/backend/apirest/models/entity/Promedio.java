package com.bolsadeideas.springboot.backend.apirest.models.entity;

public class Promedio {

	private double numeroUno;
	private double numeroDos;
	private double numeroTres;
	
	public Promedio() {
    	super();
    }
	
	public double getNumeroUno() {
		return numeroUno;
	}
	public void setNumeroUno(double numeroUno) {
		this.numeroUno = numeroUno;
	}
	public double getNumeroDos() {
		return numeroDos;
	}
	public void setNumeroDos(double numeroDos) {
		this.numeroDos = numeroDos;
	}
	public double getNumeroTres() {
		return numeroTres;
	}
	public void setNumeroTres(double numeroTres) {
		this.numeroTres = numeroTres;
	}
	
	
}
