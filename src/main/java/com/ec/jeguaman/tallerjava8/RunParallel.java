/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8;

import com.ec.jeguaman.tallerjava8.util.CargaInformacion;

/**
 *
 * @author J Guaman
 */
public class RunParallel {

    public static void main(String[] args) {
        long datosNormal = imprimirNormal();
        long datosParallel = imprimirParallel();
        System.out.println("\n\nPROCESAMIENTO DE DATOS");
        System.out.println("El tiempo de ejecución de los datos en Normal es: " + datosNormal);
        System.out.println("El tiempo de ejecución de los datos en Parallel es: " + datosParallel);
    }

    public static long imprimirNormal() {
        System.out.println("Impresión datos Normal");
        long tiempoInicial = System.currentTimeMillis();
        CargaInformacion.obtenerEmpleadosConstructoraCompleto().stream().forEach(e -> System.out.println("Hilo: " + Thread.currentThread() + ": " + e));
        return System.currentTimeMillis() - tiempoInicial;
    }

    public static long imprimirParallel() {
        System.out.println("Impresión datos Parallel");
        long tiempoInicial = System.currentTimeMillis();
        CargaInformacion.obtenerEmpleadosConstructoraCompleto().parallelStream().forEach(e -> System.out.println("Hilo: " + Thread.currentThread() + ": " + e));
        return System.currentTimeMillis() - tiempoInicial;
    }

}
