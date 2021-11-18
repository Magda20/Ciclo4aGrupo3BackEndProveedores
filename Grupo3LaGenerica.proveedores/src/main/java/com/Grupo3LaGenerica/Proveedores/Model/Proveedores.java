package com.Grupo3LaGenerica.Proveedores.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (value="db_Proveedores")
public class Proveedores {

	
	@Id 
	
	private Integer nit;
	private String Nombre;
	private String Direccion;
	private String Telefono;
	private String Ciudad;
	
	
	
	public Integer getnit() {
		return nit;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setnit(Integer nit) {
		this.nit = nit;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	
	
}
