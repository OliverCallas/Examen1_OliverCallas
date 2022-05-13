package com.idat.examen1.servicio;

import java.util.List;

import com.idat.examen1.model.MallaCurriculamModel;

public interface MallaServicio {

	public void guardarMalla(MallaCurriculamModel mall);
	
	public void editarMalla(MallaCurriculamModel mall);
	
	public void eliminarMalla(Integer id);
	
	public List<MallaCurriculamModel> listarMalla();
	
	public MallaCurriculamModel obtenerMallaId(Integer id);
	
}
