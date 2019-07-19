package com.projetospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetospring.dominio.Cliente;
import com.projetospring.services.ClienteService;

@RestController
@RequestMapping(value="/Clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cliente> listarId(@PathVariable Long id) {
		
		Cliente cliente = service.find(id);
		return ResponseEntity.ok().body(cliente);
	}
}
