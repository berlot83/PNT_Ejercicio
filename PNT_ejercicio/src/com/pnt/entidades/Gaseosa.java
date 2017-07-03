package com.pnt.entidades;

public class Gaseosa extends Articulo {
	
	private double litros;
	
		public Gaseosa(String descripcion, double litros, double precio){
			super(descripcion, precio);
			this.litros= litros;
		}

		public void setLitros(double litros){
			this.litros= litros;
		}
				
		public double getLitros(){
			return litros;
		}

		
		@Override
		public String toString(){
			return "Nombre: "+getDescripcion()+" /// Litros: "+getLitros()+" /// precio: $"+getPrecio();	
		}
				
}