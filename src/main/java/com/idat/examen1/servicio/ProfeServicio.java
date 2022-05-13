package com.idat.examen1.servicio;

import java.util.List;

import com.idat.examen1.model.ProfesorModel;


public interface ProfeServicio {

	public void guardarprofesores(ProfesorModel pro);
	
	public void editarprofesores(ProfesorModel pro);
	
	public void eliminarProfesores(Integer id);
	
	public List<ProfesorModel> listarprofesores();
	
	public ProfesorModel obtenerprofesoresId(Integer id);
	
}
