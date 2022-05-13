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

import com.idat.examen1.model.MallaCurriculamModel;
import com.idat.examen1.servicio.MallaServicio;

@RestController
@RequestMapping("/examen/malla")
public class MallaControlador {

	@Autowired
	private MallaServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<MallaCurriculamModel>> listarMalla(){
		
		return new ResponseEntity<List<MallaCurriculamModel>> (servicio.listarMalla(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar (@RequestBody MallaCurriculamModel mall){
		
		servicio.guardarMalla(mall);
		
		return new  ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCurriculamModel> listarPorId(@PathVariable Integer id) {
		
		MallaCurriculamModel m = servicio.obtenerMallaId(id);
		
		if(m != null) 
			return new ResponseEntity<MallaCurriculamModel>(m, HttpStatus.OK);
			
		return new  ResponseEntity<MallaCurriculamModel>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void> editar(@RequestBody MallaCurriculamModel mall) {
		
		MallaCurriculamModel m = servicio.obtenerMallaId(mall.getIdMalla());
		
		if(m != null) {
			servicio.editarMalla(mall);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		
		MallaCurriculamModel m = servicio.obtenerMallaId(id);
		if(m != null) {
			servicio.eliminarMalla(id);
			return new ResponseEntity<Void>(HttpStatus.OK);}
			
		return new  ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
}
