/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8;

import com.ec.jeguaman.tallerjava8.util.CargaInformacion;
import java.math.BigDecimal;

/**
 *
 * @author J Guaman
 */
public class RunFilter {

    public static void main(String[] args) {
        System.out.println("Filtro1: Filtra empleados por Salario mayor a 500.00");
        //Se utilizará Streams
        CargaInformacion.obtenerEmpleadosConstructora().stream().filter(emp -> (emp.getSalario().compareTo(new BigDecimal("500.00")) >= 0)).forEach(System.out::println);

        System.out.println("\nFiltro2: Filtra empledos Ecuatorianos y Analistas");
        CargaInformacion.obtenerEmpleadosConstructora().stream().filter(emp -> emp.getNacionalidad().compareTo("Ecuador") == 0 && emp.getCargo().compareTo("ANALISTA") == 0).forEach(System.out::println);

        System.out.println("\nFiltro3: Filtra empleados que no tengan bonos");
        CargaInformacion.obtenerEmpleadosConstructora().stream().filter(emp -> emp.getBono().compareTo(BigDecimal.ZERO) == 0).forEach(System.out::println);
    }
}
