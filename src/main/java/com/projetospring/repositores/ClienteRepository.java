package com.projetospring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetospring.dominio.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
