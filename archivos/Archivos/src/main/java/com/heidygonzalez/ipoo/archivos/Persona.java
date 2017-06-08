package com.heidygonzalez.ipoo.archivos;

public class Persona {
	
	private int id;
	private String nombre;
	private String nroDoc;
	private String direccion;
	
	
	public Persona(int id, String nombre, String nroDoc, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroDoc = nroDoc;
		this.direccion = direccion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNroDoc() {
		return nroDoc;
	}


	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
