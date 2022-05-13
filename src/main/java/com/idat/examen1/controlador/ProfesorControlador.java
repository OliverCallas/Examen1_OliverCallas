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

import com.idat.examen1.model.ProfesorModel;
import com.idat.examen1.servicio.ProfeServicio;

@RestController
@RequestMapping("/examen/profesor")
public class ProfesorControlador {

	@Autowired
	private ProfeServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<ProfesorModel>> listarProfesor(){
		
		return new ResponseEntity<List<ProfesorModel>> (servicio.listarprofesores(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar (@RequestBody ProfesorModel pro){
		
		servicio.guardarprofesores(pro);
		
		return new  ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProfesorModel> listarPorId(@PathVariable Integer id) {
		
		ProfesorModel p = servicio.obtenerprofesoresId(id);
		
		if(p != null) 
			return new ResponseEntity<ProfesorModel>(p, HttpStatus.OK);
			
		return new  ResponseEntity<ProfesorModel>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void> editar(@RequestBody ProfesorModel pro) {
		
		ProfesorModel p = servicio.obtenerprofesoresId(pro.getIdProfesor());
		
		if(p != null) {
			servicio.editarprofesores(pro);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		
		ProfesorModel p = servicio.obtenerprofesoresId(id);
		if(p != null) {
			servicio.eliminarProfesores(id);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
}
