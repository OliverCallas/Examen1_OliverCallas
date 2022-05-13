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

import com.idat.examen1.model.CursoModel;
import com.idat.examen1.model.MallaCurriculamModel;
import com.idat.examen1.servicio.CursoServicio;

@RestController
@RequestMapping("/examen/curso")
public class CursoControlador {
	
	@Autowired
	private CursoServicio servicio;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<CursoModel>> ListarCurso(){
		
		return new ResponseEntity<List<CursoModel>> (servicio.listarCursos(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar (@RequestBody CursoModel cur){
		
		servicio.guardarCurso(cur);
		
		return new  ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<CursoModel> listarPorId(@PathVariable Integer id) {
		
		CursoModel c = servicio.obtenerCurso(id);
		
		if(c != null) 
			return new ResponseEntity<CursoModel>(c, HttpStatus.OK);
			
		return new  ResponseEntity<CursoModel>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void> editar(@RequestBody CursoModel cur) {
		
		CursoModel c = servicio.obtenerCurso(cur.getIdCurso());
		
		if(c != null) {
			servicio.editarCurso(cur);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		
		CursoModel c = servicio.obtenerCurso(id);
		if(c != null) {
			servicio.eliminarCurso(id);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
}
