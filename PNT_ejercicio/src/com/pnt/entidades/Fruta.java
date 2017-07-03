package com.pnt.entidades;

public class Fruta extends Articulo {
	
	private String unidad;
	
		public Fruta(String descripcion, double precio, String unidad){
			super(descripcion, precio);
			this.unidad= unidad;
		}
		
		public String getUnidad() {
			return unidad;
		}
		
		public void setUnidad(String unidad) {
			this.unidad = unidad;
		}
			
				
		@Override
		public String toString(){
			return "Nombre: "+getDescripcion()+" /// Precio: $"+ getPrecio() +" /// Unidad de venta: "+getUnidad();
		}
}
