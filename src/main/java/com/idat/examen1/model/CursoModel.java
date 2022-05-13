package com.idat.examen1.model;

import java.io.Serializable;

public class CursoModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4786691114042394757L;
	
	private Integer idCurso;
	private String curso;
	private String descripcion;
	private String idMalla;
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(String idMalla) {
		this.idMalla = idMalla;
	}
	
	public CursoModel(Integer idCurso, String curso, String descripcion, String idMalla) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.idMalla = idMalla;
	}
	
	
	

}
