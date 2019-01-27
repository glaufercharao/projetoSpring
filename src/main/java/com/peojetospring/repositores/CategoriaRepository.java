package com.peojetospring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peojetospring.dominio.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
