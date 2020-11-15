/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8.behavior;

import com.ec.jeguaman.tallerjava8.modelo.Empleado;

/**
 *
 * @author J Guaman
 */
@FunctionalInterface
public interface PredicadoEmpleado {

    public boolean filtrar(Empleado emp);

}
