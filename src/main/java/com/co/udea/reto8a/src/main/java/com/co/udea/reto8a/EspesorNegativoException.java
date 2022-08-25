package com.co.udea.reto8a;

/**
 *
 * @author HOME
 */
public class EspesorNegativoException extends Exception {

    public EspesorNegativoException() {
        super("El espesor debe ser mayor a 0");
    }

}
