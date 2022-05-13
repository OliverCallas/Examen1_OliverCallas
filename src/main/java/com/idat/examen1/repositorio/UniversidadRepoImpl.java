package com.idat.examen1.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.idat.examen1.model.UniversidadModel;

public class UniversidadRepoImpl implements UniversidadRepo {

	public List<UniversidadModel> listar = new ArrayList<UniversidadModel>();
	
	@Override
	public void guardarUniversidad(UniversidadModel uni) {
		// TODO Auto-generated method stub
		listar.add(uni);
	}

	@Override
	public void editarUniversidad(UniversidadModel uni) {
		// TODO Auto-generated method stub
		listar.remove(obtenerUniversidadId(uni.getIdUniversidad()));
		listar.add(uni);

	}

	@Override
	public void eliminarUniversidad(Integer id) {
		listar.remove(obtenerUniversidadId(id));

	}

	@Override
	public List<UniversidadModel> listarUniversidades() {
		// TODO Auto-generated method stub
		
		return listar;
	}

	@Override
	public UniversidadModel obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		
		return listar.stream().filter(uni ->uni.getIdUniversidad() == id).findFirst().orElse(null);
	
	}
}
