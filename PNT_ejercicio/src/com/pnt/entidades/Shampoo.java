package com.pnt.entidades;

public class Shampoo extends Articulo {
	
	private	int contenido;
	
	public Shampoo( String descripcion, int contenido, double precio ){
		super(descripcion, precio);
		this.contenido=contenido;

	}	
	
				public int getContenido() {
					return contenido;
				}
				
				public void setContenido(int contenido) {
					this.contenido = contenido;
				}
					
				
					@Override
						public String descripcion(){
							return "Nombre: "+ getDescripcion() +" /// contenido: "+ contenido +" /// precio: "+ getPrecio();
						}
			
						
				 	//Puede usarse tambi�n la sobreescritura de toString().
						 
					@Override
						public String toString(){
							return "Nombre: "+ getDescripcion() +" /// contenido: "+ contenido +" /// precio: "+ getPrecio();
						}
					

}