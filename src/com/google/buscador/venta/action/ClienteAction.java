package com.google.buscador.venta.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.CelularBean;
import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.bean.tipo;
import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.service.CelularServiceImpl;
import com.google.buscador.venta.service.ClienteServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@ParentPackage("dawi")
public class ClienteAction extends ActionSupport{


	private static final long serialVersionUID = 1L;

	@Getter @Setter
	private List<tipo> lsttipo;
	
	@Getter @Setter
	private Cliente cliente;
	
	// Acceder a Session en Struts
	private Map<String, Object> session = ActionContext.getContext().getSession();

	
	
	@Action(value = "/cargatipo", results = { @Result(name = "salida", type = "json") })
	public String metodo01() {
		ClienteServiceImpl service = new ClienteServiceImpl();
		try {
			lsttipo = service.listatipo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "salida";
	}
	   // Para que no se inserte al hacer F5 se tiene que enviar por sendRedirec
		// Es como se copiara la ruta en el Browser
		// para eso el Struts tiene un type="redirect"

		@Action(value = "/registraCliente", results = {@Result(name = "salida", location = "/registraCliente.jsp", type = "redirect") })
		public String metodo02() {
			ClienteServiceImpl service = new ClienteServiceImpl();
			try {
				int s = service.insertaCliente(cliente);
				if (s > 0) {
					session.put("MENSAJE", "Registro exitoso");
				} else {
					session.put("MENSAJE", "Registro err�neo");
				}
			} catch (Exception e) {
				e.printStackTrace();
				session.put("MENSAJE", "Registro err�neo");
			}

			return "salida";
		}
	
}



