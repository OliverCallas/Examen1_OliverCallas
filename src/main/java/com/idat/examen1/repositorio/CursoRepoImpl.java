package com.idat.examen1.repositorio;

import java.util.ArrayList;

import java.util.List;

import com.idat.examen1.model.CursoModel;

public class CursoRepoImpl implements CursoRepo {

	public List<CursoModel> listar = new ArrayList<CursoModel>();
	
	@Override
	public void guardarCurso(CursoModel cur) {
		// TODO Auto-generated method stub
		listar.add(cur);
	}

	@Override
	public void editarCurso(CursoModel cur) {
		// TODO Auto-generated method stub
		listar.remove(obtenerCurso(cur.getIdCurso()));
		listar.add(cur);
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerCurso(id));
	}

	@Override
	public List<CursoModel> listarCursos() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public CursoModel obtenerCurso(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(uni ->uni.getIdCurso() == id).findFirst().orElse(null);
	}

}
