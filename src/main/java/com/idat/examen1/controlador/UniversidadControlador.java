package com.idat.examen1.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.examen1.model.UniversidadModel;
import com.idat.examen1.servicio.UniversidadServicio;

@RestController
@RequestMapping("/examen/uni")
public class UniversidadControlador {

	@Autowired
	private UniversidadServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<UniversidadModel>> listarProducto(){
		
		return new ResponseEntity<List<UniversidadModel>> (servicio.listarUniversidades(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar (@RequestBody UniversidadModel uni){
		
		servicio.guardarUniversidad(uni);
		
		return new  ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<UniversidadModel> listarPorId(@PathVariable Integer id) {
		
		UniversidadModel u = servicio.obtenerUniversidadId(id);
		
		if(u != null) 
			return new ResponseEntity<UniversidadModel>(u, HttpStatus.OK);
			
		return new  ResponseEntity<UniversidadModel>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void> editar(@RequestBody UniversidadModel uni) {
		
		UniversidadModel u = servicio.obtenerUniversidadId(uni.getIdUniversidad());
		
		if(u != null) {
			servicio.editarUniversidad(uni);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		
		UniversidadModel u = servicio.obtenerUniversidadId(id);
		if(u != null) {
			servicio.eliminarUniversidad(id);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
}
