package com.heidygonzalez.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.heidygonzalez.ipoo.repuestos.cliente.Cliente;

public class DummyStorage implements Storage {
	
	private List<Cliente> clientes;
	
	public DummyStorage(){
		
		clientes=new ArrayList<>();
		
		long id= 0;
		
		Cliente c=new Cliente();
		c.setTipoDoc("CI");
		c.setNroDoc("9999");
		c.setNombre("Heidy Gonzalez");
		c.setId(++id);
		
		clientes.add(c);
		
	}

	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
