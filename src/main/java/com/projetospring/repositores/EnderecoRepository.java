package com.projetospring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetospring.dominio.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
