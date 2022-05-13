package com.idat.examen1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examen1.model.UniversidadModel;
import com.idat.examen1.repositorio.UniversidadRepo;

@Service
public class UniversidadServicioImpl implements UniversidadServicio {

	@Autowired
	public UniversidadRepo repo;
	
	@Override
	public void guardarUniversidad(UniversidadModel uni) {
		// TODO Auto-generated method stub
		repo.guardarUniversidad(uni);

	}

	@Override
	public void editarUniversidad(UniversidadModel uni) {
		// TODO Auto-generated method stub
		repo.editarUniversidad(uni);
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		repo.eliminarUniversidad(id);
	}

	@Override
	public List<UniversidadModel> listarUniversidades() {
		// TODO Auto-generated method stub
		
		
		return repo.listarUniversidades();
	}

	@Override
	public UniversidadModel obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		return repo.obtenerUniversidadId(id);
	}

}
