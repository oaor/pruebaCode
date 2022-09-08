package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table (name ="Empleado")
public class Empleado {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombreEmpleado;
    private String correoEmpleado;
    private String rol;


}
