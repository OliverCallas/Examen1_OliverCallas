package com.idat.examen1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examen1.model.ProfesorModel;
import com.idat.examen1.repositorio.ProfeRepo;

@Service
public class ProfeServicioImpl implements ProfeServicio {

	@Autowired
	public ProfeRepo repo;
	
	@Override
	public void guardarprofesores(ProfesorModel pro) {
		// TODO Auto-generated method stub
		repo.guardarprofesores(pro);
	}

	@Override
	public void editarprofesores(ProfesorModel pro) {
		// TODO Auto-generated method stub
		repo.editarprofesores(pro);
	}

	@Override
	public void eliminarProfesores(Integer id) {
		// TODO Auto-generated method stub
		repo.eliminarProfesores(id);
	}

	@Override
	public List<ProfesorModel> listarprofesores() {
		// TODO Auto-generated method stub
		return repo.listarprofesores();
	}

	@Override
	public ProfesorModel obtenerprofesoresId(Integer id) {
		// TODO Auto-generated method stub
		return repo.obtenerprofesoresId(id);
	}

}
