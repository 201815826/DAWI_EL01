package com.google.buscador.venta.bean;

import lombok.Data;

@Data
public class CategoriaBean {

	private int idCategoria;
	private String nombre;
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
