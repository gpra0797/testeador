package com.testeador.model;

import java.util.Date;

public class Prueba {
	private int id;
	private String descripcion;
	private Date fechaCreacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	@Override
	public String toString() {
		return "Prueba [id=" + id + ", descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + "]";
	}
	
	
}
