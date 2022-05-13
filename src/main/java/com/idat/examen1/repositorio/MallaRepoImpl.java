package com.idat.examen1.repositorio;

import java.util.ArrayList;

import java.util.List;

import com.idat.examen1.model.MallaCurriculamModel;

public class MallaRepoImpl implements MallaRepo {

	public List<MallaCurriculamModel> listar = new ArrayList<MallaCurriculamModel>();
	
	@Override
	public void guardarMalla(MallaCurriculamModel mall) {
		// TODO Auto-generated method stub
		listar.add(mall);
	}

	@Override
	public void editarMalla(MallaCurriculamModel mall) {
		// TODO Auto-generated method stub
		listar.remove(obtenerMallaId(mall.getIdMalla()));
		listar.add(mall);
	}

	@Override
	public void eliminarMalla(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerMallaId(id));
	}

	@Override
	public List<MallaCurriculamModel> listarMalla() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public MallaCurriculamModel obtenerMallaId(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(uni ->uni.getIdMalla() == id).findFirst().orElse(null);
	}

}
