package com.co.udea.reto8a;

/**
 * @Jaime Muñoz
 * @Juan David Vásquez
 */
public class NoAsfalto extends Tramo {

    public final double ANCHO = 6;
    private double espesor;
    private String material;

    public NoAsfalto(double xInicial, double xFinal, double yInicial, double yFinal) {
        super(xInicial, xFinal, yInicial, yFinal);
    }

    public NoAsfalto(double espesor, String material, double xInicial, double xFinal, double yInicial, double yFinal) throws EspesorNegativoException {
        super(xInicial, xFinal, yInicial, yFinal);
        if (espesor <= 0) {
            throw new EspesorNegativoException();
        } else {
            this.espesor = espesor;
        }

        if (material.equalsIgnoreCase("Arena") || material.equalsIgnoreCase("Piedra") || material.equalsIgnoreCase("Balastro")) {
            this.material = material;
        } else {
            this.material = null;
        }

    }

    @Override
    public double getArea() {
        double area = this.longitud() * ANCHO;
        return area;
    }

    @Override
    public double getVolumen() {
        double volumen = this.longitud() * ANCHO * espesor;
        return volumen;
    }

    public double getEspesor() {
        return espesor;
    }

    public void setEspesor(double espesor) throws EspesorNegativoException {
        if (espesor <= 0) {
            throw new EspesorNegativoException();
        } else {
            this.espesor = espesor;
        }

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
