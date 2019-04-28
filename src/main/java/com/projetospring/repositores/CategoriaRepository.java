package com.projetospring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetospring.dominio.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
