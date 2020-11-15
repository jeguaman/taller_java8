/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8;

import com.ec.jeguaman.tallerjava8.modelo.Empleado;
import com.ec.jeguaman.tallerjava8.util.CargaInformacion;
import java.util.Comparator;

/**
 *
 * @author J Guaman
 */
public class RunOrdenamiento {
    
    public static void main(String[] args) {
        System.out.println("\nFiltro2: Filtra y Ordena los 2 empleados con mayor salario");
        CargaInformacion.obtenerEmpleadosConstructora().stream().sorted(Comparator.comparing(Empleado::getApellido)).forEach(System.out::println);
        
        System.out.println("\nFiltro2: Filtra y Ordena los 2 empleados con mayor salario");
        CargaInformacion.obtenerEmpleadosConstructora().stream().sorted(Comparator.comparing(Empleado::getSalario).reversed()).limit(2).forEach(System.out::println);
        
        System.out.println("\nFiltro3: Ordena los empleados por salario de menor a mayor.");
        CargaInformacion.obtenerEmpleadosConstructora().stream().sorted(Comparator.comparing(Empleado::getSalario)).forEach(System.out::println);
        
    }
}
