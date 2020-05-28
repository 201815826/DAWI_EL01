package com.google.buscador.venta.bean;

public class Cliente {
private int idcliente;
private String nombre;
private String apellido;
private String dni;
private String fecha;
private tipo tipo;
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public tipo getTipo() {
	return tipo;
}
public void setTipo(tipo tipo) {
	this.tipo = tipo;
}

}
