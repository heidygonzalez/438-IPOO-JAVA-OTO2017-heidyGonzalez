package com.heidygonzalez.ipoo.repuestos.storage;

import com.heidygonzalez.ipoo.repuestos.cliente.Cliente;

public interface Storage {
	
	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}
