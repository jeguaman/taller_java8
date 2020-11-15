/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8.behavior;

import com.ec.jeguaman.tallerjava8.modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J Guaman
 */
public class ControllerEmpleado {

    public static List<Empleado> filtrar(List<Empleado> empleados, PredicadoEmpleado predicado) {
        List<Empleado> empleadoRetorno = new ArrayList<>();
        empleados.stream().filter(empleado -> (predicado.filtrar(empleado))).forEachOrdered(empleado -> {
            empleadoRetorno.add(empleado);
        });
        return empleadoRetorno;
    }
}
