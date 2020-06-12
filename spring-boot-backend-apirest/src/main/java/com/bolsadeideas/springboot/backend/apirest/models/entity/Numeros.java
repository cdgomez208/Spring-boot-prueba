package com.bolsadeideas.springboot.backend.apirest.models.entity;


//request para la calculadora
public class Numeros {

    private double numeroUno;
	
	private double numeroDo;

    public Numeros() {
    	super();
    }
	
	public double getNumeroUno() {
		return numeroUno;
	}

	public void setNumeroUno(double numeroUno) {
		this.numeroUno = numeroUno;
	}

	public double getNumeroDo() {
		return numeroDo;
	}

	public void setNumeroDo(double numeroDo) {
		this.numeroDo = numeroDo;
	}
	
	
	
	
	
}
