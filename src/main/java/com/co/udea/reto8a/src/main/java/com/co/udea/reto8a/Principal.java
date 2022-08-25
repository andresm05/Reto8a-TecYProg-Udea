package com.co.udea.reto8a;

import java.util.ArrayList;
import java.util.List;
/**
 * @Jaime Muñoz
 * @Juan David Vásquez
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Carretera 1: \n");

        List<Tramo> via = new ArrayList<>();
        /*Creacion de vias asfaltadas y agregarlas a la lista*/
        Carretera roadWay = new Carretera(via);
        Tramo calle = new Asfalto(0, 1, 0, 2);
        roadWay.getVia().add(calle);
        Tramo calle2 = new Asfalto(1, 4, 2, 2);
        roadWay.getVia().add(calle2);

        /*Creación de vías no asfaltadas y agregarlas a la lista*/
        Tramo calle3;
        try {
            calle3 = new NoAsfalto(0.2, "piedra", 4, 5, 2, 0);
            roadWay.getVia().add(calle3);
        } catch (EspesorNegativoException ex) {
            System.out.println(ex.getMessage());
        }

        Tramo calle4;
        try {
            calle4 = new NoAsfalto(0.15, "arena", 5, 3, 0, -3);
            roadWay.getVia().add(calle4);
        } catch (EspesorNegativoException ex) {
            System.out.println(ex.getMessage());
        }


        /*Verificar si las vías se conectan*/
        if (roadWay.conecta()) {
            System.out.println("Las vías están conectadas");
        } else {
            System.out.println("Las vías no están conectadas");
        }
        System.out.println("Área total: " + roadWay.getArea());
        System.out.println("Longitud total: " + roadWay.getLongitud());
        System.out.println("Volumen total de material a utilizar: " + roadWay.getVolumen());
        System.out.println("Volumen total tramos de asfalto a utilizar: " + roadWay.getVolumenAsfalto());
        System.out.println("Volumen total tramos sin asfalto a utilizar: " + roadWay.getVolumenNoAsfalto());

        System.out.println("\nCarretera 2: \n");
        List<Tramo> via2 = new ArrayList<>();
        Carretera roadWay2 = new Carretera(via2);
        /*Creación de vías asfaltadas y agregarlas a la lista*/
        calle = new Asfalto(-1, 0, 0, 2);
        roadWay2.getVia().add(calle);
        calle2 = new Asfalto(0, 4, 2, 3);
        roadWay2.getVia().add(calle2);
        try {
            /*Creación de vías no asfaltadas y agregarlas a la lista*/
            calle3 = new NoAsfalto(0.15, "balastro", 3, 0, 1, -2);
            roadWay2.getVia().add(calle3);
        } catch (EspesorNegativoException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            calle4 = new NoAsfalto(0.1, "Arena", 0, 3, -2, -2);
            roadWay.getVia().add(calle4);
        } catch (EspesorNegativoException ex) {
            System.out.println(ex.getMessage());
        }


        /*Verificar si las vías se conectan*/
        if (roadWay2.conecta()) {
            System.out.println("Las vías están conectadas");
        } else {
            System.out.println("Las vías no están conectadas");
        }
        System.out.println("Área total: " + roadWay2.getArea());
        System.out.println("Longitud total: " + roadWay2.getLongitud());
        System.out.println("Volumen total de material a utilizar: " + roadWay2.getVolumen());
        System.out.println("Volumen total tramos de asfalto a utilizar: " + roadWay2.getVolumenAsfalto());
        System.out.println("Volumen total tramos sin asfalto a utilizar: " + roadWay2.getVolumenNoAsfalto());
    }
}
