/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8;

import com.ec.jeguaman.tallerjava8.behavior.ControllerEmpleado;
import com.ec.jeguaman.tallerjava8.behavior.SearchCargoAnalista;
import com.ec.jeguaman.tallerjava8.util.CargaInformacion;

/**
 *
 * @author J Guaman
 */
public class RunBehavior {

    public static void main(String[] args) {
        //System.out.println("EmpleadO: " + CargaInformacion.obtenerEmpleadosConstructora());
        System.out.println("Empleados filtrados por el Cargo de Analista");
        ControllerEmpleado.filtrar(CargaInformacion.obtenerEmpleadosConstructora(), new SearchCargoAnalista()).forEach(System.out::println);
    }
}
