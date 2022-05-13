package com.idat.examen1.servicio;

import java.util.List;

import com.idat.examen1.model.UniversidadModel;

public interface UniversidadServicio {

	public void guardarUniversidad(UniversidadModel uni);
	
	public void editarUniversidad(UniversidadModel uni);
	
	public void eliminarUniversidad(Integer id);
	
	public List<UniversidadModel> listarUniversidades();
	
	public UniversidadModel obtenerUniversidadId(Integer id);
	
}
