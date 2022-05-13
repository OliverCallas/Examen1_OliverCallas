package com.idat.examen1.model;

import java.io.Serializable;

public class UniversidadModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2233925346927219485L;
	
	private Integer idUniversidad;
	private String Universidad;
	
	
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	public UniversidadModel(Integer idUniversidad, String universidad) {
		super();
		this.idUniversidad = idUniversidad;
		Universidad = universidad;
	}
	
	
	
}
