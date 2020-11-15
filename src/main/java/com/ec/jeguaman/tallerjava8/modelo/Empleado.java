/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8.modelo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author J Guaman
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String identificacion;
    private String cargo;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private BigDecimal salario;
    private BigDecimal bono;

    public Empleado(String nombre, String apellido, String nacionalidad, String identificacion, String cargo, Date fechaNacimiento, Date fechaIngreso, BigDecimal salario, BigDecimal bono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getBono() {
        return bono;
    }

    public void setBono(BigDecimal bono) {
        this.bono = bono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.identificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.identificacion, other.identificacion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", nacionalidad=").append(nacionalidad);
        sb.append(", identificacion=").append(identificacion);
        sb.append(", cargo=").append(cargo);
        sb.append(", salario=").append(salario);
        sb.append(", bono=").append(bono);
        sb.append('}');
        return sb.toString();
    }

}
