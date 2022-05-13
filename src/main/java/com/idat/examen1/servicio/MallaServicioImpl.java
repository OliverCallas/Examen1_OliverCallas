package com.idat.examen1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examen1.model.MallaCurriculamModel;
import com.idat.examen1.repositorio.MallaRepo;

@Service
public class MallaServicioImpl implements MallaServicio {

	@Autowired
	public MallaRepo repo;
	
	@Override
	public void guardarMalla(MallaCurriculamModel mall) {
		// TODO Auto-generated method stub
		repo.guardarMalla(mall);
	}

	@Override
	public void editarMalla(MallaCurriculamModel mall) {
		// TODO Auto-generated method stub
		repo.editarMalla(mall);
	}

	@Override
	public void eliminarMalla(Integer id) {
		// TODO Auto-generated method stub
		repo.eliminarMalla(id);
	}

	@Override
	public List<MallaCurriculamModel> listarMalla() {
		// TODO Auto-generated method stub
		return repo.listarMalla();
	}

	@Override
	public MallaCurriculamModel obtenerMallaId(Integer id) {
		// TODO Auto-generated method stub
		return repo.obtenerMallaId(id);
	}

}
