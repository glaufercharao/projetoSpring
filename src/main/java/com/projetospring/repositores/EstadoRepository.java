package com.projetospring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetospring.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
