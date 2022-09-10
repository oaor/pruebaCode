package com.UdeA.Ciclo3.repo;

import com.UdeA.Ciclo3.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository  //Anotación que le indica al Spring que esto es un repositorio
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
