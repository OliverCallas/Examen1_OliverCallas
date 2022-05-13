package com.idat.examen1.model;

import java.io.Serializable;

public class ProfesorModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7461671753683525542L;
	
	
	private Integer idProfesor ;
	private String profesor;
	
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public ProfesorModel(Integer idProfesor, String profesor) {
		super();
		this.idProfesor = idProfesor;
		this.profesor = profesor;
	}
	
	
	
}
