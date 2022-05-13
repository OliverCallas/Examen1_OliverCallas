package com.idat.examen1.model;

import java.io.Serializable;

public class MallaCurriculamModel implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4872734865081718395L;
	
	
	private Integer idMalla;
	private String año;
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	
	public MallaCurriculamModel(Integer idMalla, String año) {
		super();
		this.idMalla = idMalla;
		this.año = año;
	}
	
	
	
	
}
