package com.Udea.UmbrellaSoft2.repo;

import com.Udea.UmbrellaSoft2.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer> {


}
