package com.Udea.UmbrellaSoft2.servicio;

import com.Udea.UmbrellaSoft2.repo.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServicio {

    @Autowired
    EmpresaRepositorio empresaRepositorio;

}
