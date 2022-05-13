package com.idat.examen1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examen1.model.CursoModel;
import com.idat.examen1.repositorio.CursoRepo;

@Service
public class CursoServicioImpl implements CursoServicio {

	@Autowired
	public CursoRepo repo;
	
	@Override
	public void guardarCurso(CursoModel cur) {
		// TODO Auto-generated method stub
		repo.guardarCurso(cur);
	}

	@Override
	public void editarCurso(CursoModel cur) {
		// TODO Auto-generated method stub
		repo.editarCurso(cur);
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		repo.eliminarCurso(id);
	}

	@Override
	public List<CursoModel> listarCursos() {
		// TODO Auto-generated method stub
		return repo.listarCursos();
	}

	@Override
	public CursoModel obtenerCurso(Integer id) {
		// TODO Auto-generated method stub
		return repo.obtenerCurso(id);
	}

}
