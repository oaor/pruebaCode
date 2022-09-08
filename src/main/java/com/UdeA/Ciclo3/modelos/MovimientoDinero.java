package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table (name = "Movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private long monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    private String rol;

    public MovimientoDinero() {
    }

    public MovimientoDinero(long monto, String concepto, Empleado empleado, String rol) {
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
