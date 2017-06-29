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
					public String toString(){
						return "Nombre: "+ getDescripcion() +" /// contenido: "+ contenido +" /// precio: "+ getPrecio();
					}

}