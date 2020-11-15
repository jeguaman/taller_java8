/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.jeguaman.tallerjava8.consumer;

import java.util.List;

/**
 *
 * @author J Guaman
 */
public class Consumer {

    public static <T> void imprimir(List<T> lista, java.util.function.Consumer<T> consumer) {
        lista.forEach(t -> {
            consumer.accept(t);
        });
    }
}
