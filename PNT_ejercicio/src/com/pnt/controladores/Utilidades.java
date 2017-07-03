package com.pnt.controladores;

import java.util.List;
import com.pnt.entidades.Articulo;

public class Utilidades {

	//recorro solo una vez y pongo dos if, retorno las dos variables en una linea.
	static String masCaro_masBarato(List<Articulo> lista){
		
	Articulo masCaro=lista.get(0);
	Articulo masBarato= lista.get(0);
		
		for(Articulo resultado : lista){
			if(resultado.getPrecio() > lista.get(0).getPrecio()){
				masCaro= resultado;	
			}
			if(resultado.getPrecio() < lista.get(0).getPrecio()){
				masBarato= resultado;	
			}
		}
	return "El producto más Caro es: " + masCaro.getDescripcion()+ " 'método String'" + "\nEl producto más Barato: " + masBarato.getDescripcion()+ " 'método String'";
	}
	
	//Recorro una vez e imprimo directamente en pantalla los resultados.
	static void masCaro_masBarato_void(List<Articulo> lista){
		
	Articulo masCaro=lista.get(0);
	Articulo masBarato= lista.get(0);
		
		for(Articulo resultado : lista){
			if(resultado.getPrecio() > lista.get(0).getPrecio()){
				masCaro= resultado;	
			}
			if(resultado.getPrecio() < lista.get(0).getPrecio()){
				masBarato= resultado;	
			}
		}
	System.out.println("El producto mas Barato es: "+ masBarato.getDescripcion() + " 'metodo void'");
	System.out.println("El producto mas caro es: " + masCaro.getDescripcion() + " 'metodo void'");
	}
	
}
	
