package com.heidygonzalez.ipoo.archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Archivos {
	
	public void copiar(String origen, String destino){
	
	FileInputStream entrada=null;
	FileOutputStream salida=null;
	
	
	try{
		
		entrada=new FileInputStream(origen);
		salida=new FileOutputStream(destino);
		
		int c;
		
		while((c=entrada.read()) != -1){
			salida.write(c);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(entrada!=null)
			
			try{
				
				entrada.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		
		if(salida!=null)
			try{
				salida.close();
				
			}catch (IOException e){
				e.printStackTrace();
			}
	}
	
		
}
	
	public String leerArchivo(String archivo){
		
		FileReader entrada=null;
		char[] buffer=new char[1024];
		StringBuilder sb=new StringBuilder();
		
		try{
			entrada=new FileReader(archivo);
			while(entrada.read(buffer, 0, 1024) >0){
				sb.append(buffer);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(entrada!=null)
				
				try{
					entrada.close();
				}catch (IOException e){
					e.printStackTrace();
				}
		}
		
		return sb.toString();
		
	}
	
	
	public void escribirArchivo(String archivo, String contenido){
		
		FileWriter salida=null;
		
		char[] buffer=contenido.toCharArray();
		
		try{
			
			salida=new FileWriter(archivo);
			salida.write(buffer, 0, buffer.length);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(salida!=null);
			
				try{
					
					salida.close();
				}catch (IOException e){
					e.printStackTrace();
				}
		}
		
		
	}
	
	
	public void testObjeto(){
		
		Persona p=new Persona(1, "Heidy Gonzalez", "9999");
		ObjectMapper mapper=new ObjectMapper();
		String json;
		
		try{
			json = mapper.writeValueAsString(p);
			escribirArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\persona.txt", json);
		}catch (JsonProcessingException e1){
			e1.printStrackTrace();
		}
		
		System.out.println(leer Archivo ("438-IPOO-JAVA-OTO2017\\archivos\\persona.txt"));
	}
	
	
	public static void main (String[] args){
		
		Archivos a=new Archivos();
		
		a.testObjeto();
	}


	
}
