package com.UdeA.Ciclo3.service;

import com.UdeA.Ciclo3.modelos.Empresa;
import com.UdeA.Ciclo3.repo.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//Le decimos a spring que esta clase es de servicios
@Service
public class EmpresaService {
    @Autowired //conectamos esta clase con el repositorio de Empresa
    EmpresaRepository empresaRepository; //Creamos un objeto tipo Empresa Repository para poder usar los métodos de dicha clase

    //Método que retornará la lista de empresas usando métodos heredados de JpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa)); //REcorremos el iterable que regresa el método findAll del JPA y lo guardamos en la lista

        return empresaList;
    }

    //Método que me trae un objeto de tipo Empresa, cuando cuento con el id de la misma
    public Empresa getEmpresaById (Integer id){
        return empresaRepository.findById(id).get();
    }

    //Método para guardar o actualizar métodos de tipo Empresa
    public boolean saveOrUpdateEmpresa (Empresa empresa) {
        Empresa emp = empresaRepository.save(empresa);
        if (empresaRepository.findById(emp.getId()) != null) {
            return true;
        }
        return false;
    }
    //Método Delete
    public boolean deleteEmpresa(Integer id){
        empresaRepository.deleteById(id);
        if (getEmpresaById(id) != null){

            return false;
        }
        return true;
    }

 }
