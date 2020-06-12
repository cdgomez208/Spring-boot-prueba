package com.bolsadeideas.springboot.backend.apirest.models.entity;


//request para la pendiente
public class Pendiente {

    private double yDos;
	
	private double yUno;
	
    private double xDos;
	
	private double xUno;

	
	public Pendiente() {
		super();
		
	}

	public double getyDos() {
		return yDos;
	}

	public void setyDos(double yDos) {
		this.yDos = yDos;
	}

	public double getyUno() {
		return yUno;
	}

	public void setyUno(double yUno) {
		this.yUno = yUno;
	}

	public double getxDos() {
		return xDos;
	}

	public void setxDos(double xDos) {
		this.xDos = xDos;
	}

	public double getxUno() {
		return xUno;
	}

	public void setxUno(double xUno) {
		this.xUno = xUno;
	}
	
	
	
	
	
	
	
}
