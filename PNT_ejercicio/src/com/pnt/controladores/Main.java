package com.pnt.controladores;

import java.util.ArrayList;
import java.util.List;

import com.pnt.entidades.Articulo;
import com.pnt.entidades.Fruta;
import com.pnt.entidades.Gaseosa;
import com.pnt.entidades.Shampoo;


public class Main{
	
	public static void main(String[] argumentos){
			List<Articulo> productos= new ArrayList<>();
				productos.add(new Gaseosa("Coca-cola Zero", 2.25, 20));
				productos.add(new Gaseosa("Coca-cola", 1.5, 18));
				productos.add(new Shampoo("Sedal", 500, 30));
				productos.add(new Fruta("Frutillas", 64, "kilo"));
					
					for(Articulo resultado : productos){
							System.out.println(resultado.toString());
						
					}
					//Los métodos estáticos masBarato() y masCaro() estan en Utilidades.
						System.out.println("========================================================");
						System.out.println("Producto más barato: "+ Utilidades.masBarato_ForEach(productos));
						System.out.println("Producto más caro: "+ Utilidades.masCaro_ForEach(productos));
				
					/*
					 	Si se descomenta este código daría el mismo resultado que las dos lineas pero con forBásico
					  	System.out.println("Producto más barato: "+ Utilidades.masBarato_For(productos));
						System.out.println("Producto más caro: "+ Utilidades.masCaro_For(productos));
					 */
				}
		}

