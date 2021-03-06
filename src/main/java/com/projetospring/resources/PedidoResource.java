package com.projetospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetospring.dominio.Pedido;
import com.projetospring.services.PedidoService;

@RestController
@RequestMapping(value="/Pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Pedido> listarId(@PathVariable Long id) {
		
		Pedido pedido = service.find(id);
		return ResponseEntity.ok().body(pedido);
	}
}
