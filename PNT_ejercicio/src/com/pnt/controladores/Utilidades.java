package com.pnt.controladores;

import java.util.List;
import com.pnt.entidades.Articulo;

public class Utilidades {

	//Con Loop for avanzado
	static String masCaro_ForEach(List<Articulo> lista){
		
		Articulo masCaro=lista.get(0);
			for(Articulo resultado : lista){
				if(resultado.getPrecio() > lista.get(0).getPrecio()){
					masCaro= resultado;	
				}
		}
		return masCaro.getDescripcion();
	}
	
	
	static String masBarato_ForEach(List<Articulo> lista){
		
		Articulo masBarato= lista.get(0);
			for(Articulo resultado : lista){
				if(resultado.getPrecio() < lista.get(0).getPrecio()){
					masBarato= resultado;
				}
			}
			return masBarato.getDescripcion();
		}
	
	
	//Con Loop for básicos no implementados en Main, quedan mas largos pero sirven.
	static String masBarato_For(List<Articulo> lista){
		
		Articulo masBarato= lista.get(0);
			for(int i=0; i< lista.size(); i++){
				if(masBarato.getPrecio() > lista.get(i).getPrecio())
					{
						masBarato= lista.get(i);
					}
		}
		return masBarato.getDescripcion();
	}


	static String masCaro_For(List<Articulo> lista){
		
		Articulo masBarato= lista.get(0);
			for(int i=0; i< lista.size(); i++){
				if(masBarato.getPrecio() > lista.get(i).getPrecio())
					{
						masBarato= lista.get(i);
					}
		}
		return masBarato.getDescripcion();
	}
	
}
	
