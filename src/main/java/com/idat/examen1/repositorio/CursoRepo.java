package com.idat.examen1.repositorio;

import java.util.List;

import com.idat.examen1.model.CursoModel;

public interface CursoRepo {

	public void guardarCurso(CursoModel cur);
	
	public void editarCurso(CursoModel cur);
	
	public void eliminarCurso(Integer id);
	
	public List<CursoModel> listarCursos();
	
	public CursoModel obtenerCurso(Integer id);
	
	
}
