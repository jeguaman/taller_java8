/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8;

import com.ec.jeguaman.tallerjava8.consumer.Consumer;
import com.ec.jeguaman.tallerjava8.util.CargaInformacion;

/**
 *
 * @author J Guaman
 */
public class RunConsumer {

    public static void main(String[] args) {
        Consumer.imprimir(CargaInformacion.obtenerInformacionPersonalEmpledo(),
                a -> System.out.println(a.toUpperCase()));
    }
}
