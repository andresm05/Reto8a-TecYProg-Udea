package com.co.udea.reto8a;

/**
 * @Jaime Muñoz
 * @Juan David Vásquez
 */
public class Asfalto extends Tramo {

    public final double ANCHO = 8;
    public final double ESPESOR = 0.25;
    private String proveedor;
    private double velcidadMaxima;
    private boolean prohibidoAvanzar;

    public Asfalto(double xInicial, double xFinal, double yInicial, double yFinal) {
        super(xInicial, xFinal, yInicial, yFinal);
    }

    public Asfalto(String proveedor, double vMax, boolean prohibido, double xInicial, double xFinal, double yInicial, double yFinal) {
        super(xInicial, xFinal, yInicial, yFinal);
        this.proveedor = proveedor;
        this.velcidadMaxima = vMax;
        this.prohibidoAvanzar = prohibido;
    }

    @Override
    public double getArea() {
        double area = this.longitud() * ANCHO;
        return area;
    }

    @Override
    public double getVolumen() {
        double volumen = ANCHO * ESPESOR * this.longitud();
        return volumen;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getVelcidadMaxima() {
        return velcidadMaxima;
    }

    public void setVelcidadMaxima(double velcidadMaxima) throws VelocidadException {
        if (this.velcidadMaxima <= 0) {
            throw new VelocidadException();
        } else {
            this.velcidadMaxima = velcidadMaxima;
        }

    }

    public boolean isProhibidoAvanzar() {
        return prohibidoAvanzar;
    }

    public void setProhibidoAvanzar(boolean prohibidoAvanzar) {
        this.prohibidoAvanzar = prohibidoAvanzar;
    }

}
