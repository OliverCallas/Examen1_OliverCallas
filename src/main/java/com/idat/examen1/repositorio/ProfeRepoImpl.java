package com.idat.examen1.repositorio;

import java.util.ArrayList;

import java.util.List;

import com.idat.examen1.model.ProfesorModel;

public class ProfeRepoImpl implements ProfeRepo {

	public List<ProfesorModel> listar = new ArrayList<ProfesorModel>();
	
	@Override
	public void guardarprofesores(ProfesorModel pro) {
		// TODO Auto-generated method stub
		listar.add(pro);
	}

	@Override
	public void editarprofesores(ProfesorModel pro) {
		// TODO Auto-generated method stub
		listar.remove(obtenerprofesoresId(pro.getIdProfesor()));
		listar.add(pro);
	}

	@Override
	public void eliminarProfesores(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerprofesoresId(id));
	}

	@Override
	public List<ProfesorModel> listarprofesores() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public ProfesorModel obtenerprofesoresId(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(uni ->uni.getIdProfesor() == id).findFirst().orElse(null);
	}

}
