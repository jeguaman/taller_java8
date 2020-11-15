/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8.modelo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author J Guaman
 */
public class Constructora {

    private String nombre;
    private String identificacion;
    private String direccion;
    private String representateLegal;
    private Date fechaCreacion;
    private Integer telefono;
    private String email;
    private List<Empleado> empleados;

    public Constructora() {
    }

    public Constructora(String nombre, String identificacion, String direccion, String representateLegal, Date fechaCreacion, Integer telefono, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.representateLegal = representateLegal;
        this.fechaCreacion = fechaCreacion;
        this.telefono = telefono;
        this.email = email;
    }

    public Constructora(String nombre, String identificacion, String direccion, String representateLegal, Date fechaCreacion, Integer telefono, String email, List<Empleado> empleados) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.representateLegal = representateLegal;
        this.fechaCreacion = fechaCreacion;
        this.telefono = telefono;
        this.email = email;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentateLegal() {
        return representateLegal;
    }

    public void setRepresentateLegal(String representateLegal) {
        this.representateLegal = representateLegal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.identificacion);
        hash = 23 * hash + Objects.hashCode(this.telefono);
        hash = 23 * hash + Objects.hashCode(this.email);
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
        final Constructora other = (Constructora) obj;
        if (!Objects.equals(this.identificacion, other.identificacion)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Constructora{nombre=").append(nombre);
        sb.append(", identificacion=").append(identificacion);
        sb.append(", direccion=").append(direccion);
        sb.append(", representateLegal=").append(representateLegal);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", telefono=").append(telefono);
        sb.append(", email=").append(email);
        sb.append(", empleados=").append(empleados);
        sb.append('}');
        return sb.toString();
    }

}
