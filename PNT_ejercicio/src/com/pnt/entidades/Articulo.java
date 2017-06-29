package com.pnt.entidades;


public abstract class Articulo {
	
		private double precio;
		private String descripcion;
		
			public Articulo(String descripcion, double precio){
				this.descripcion= descripcion;
				this.precio=precio;
			}

				public void setPrecio(double precio){
					this.precio=precio;
				}
				
				public double getPrecio(){
					return precio;
				}

				public String getDescripcion() {
					return descripcion;
				}

				public void setDescripcion(String descripcion) {
					this.descripcion = descripcion;
				}
	}