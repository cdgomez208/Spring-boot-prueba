package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.AreaTriangulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Circulo;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Numeros;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Pendiente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Promedio;

public interface CalculadoraService {
	
	    
    public double calculadoraSuma (Numeros numeros );
 
    public double calculadoraResta(Numeros numeros);
    
    public double calculadoraDivision(Numeros numeros);
    
    public double calculadoraMultiplicacion(Numeros numeros);

    public double calcularPendiente(Pendiente pendiente);
    
    public double calcularPromedio(Promedio promedio); 
    
    public double calcularArea(AreaTriangulo areaTriangulo);
    
    public double calcularAreaCirculo (Circulo circulo);
    
    
    
    
}
