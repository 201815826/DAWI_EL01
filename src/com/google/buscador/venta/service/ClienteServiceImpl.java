package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.bean.CelularBean;
import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.bean.tipo;
import com.google.buscador.venta.daos.CelularDAO;
import com.google.buscador.venta.daos.ClienteDAO;
import com.google.buscador.venta.daos.DAOFactory;

public class ClienteServiceImpl implements ClienteService{

	DAOFactory fabrica = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ClienteDAO dao = fabrica.getCliente();
	
	@Override
	public int insertaCliente(Cliente obj) throws Exception {
		return dao.insertaCliente(obj);
	}

	@Override
	public List<tipo> listatipo() throws Exception {
		return dao.listatipo();
	}

	
}
