package com.projetospring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetospring.dominio.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
