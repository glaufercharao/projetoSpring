package com.projetospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetospring.dominio.Categoria;
import com.projetospring.services.CategoriaService;

@RestController
@RequestMapping(value="/Categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listarId(@PathVariable Long id) {
		
		Categoria categoria = service.buscar(id);
		return ResponseEntity.ok().body(categoria);
	}
}