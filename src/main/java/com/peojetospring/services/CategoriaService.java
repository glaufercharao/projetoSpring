package com.peojetospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peojetospring.dominio.Categoria;
import com.peojetospring.repositores.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Long id) {
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElse(null);	
	}

}
