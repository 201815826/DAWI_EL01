package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.bean.CelularBean;
import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.bean.tipo;
public interface ClienteService {

	public int insertaCliente(Cliente obj) throws Exception;
	
	public List<tipo> listatipo() throws Exception;
	
	
}
