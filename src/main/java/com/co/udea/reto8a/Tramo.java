package com.co.udea.reto8a;

/**
 *
 * @Jaime Muñoz
 * @Juan David Vásquez
 */
public abstract class Tramo {

    protected double xInicial;
    protected double xFinal;
    protected double yInicial;
    protected double yFinal;

    public Tramo(double xInicial, double xFinal, double yInicial, double yFinal) {
        this.xInicial = xInicial;
        this.xFinal = xFinal;
        this.yInicial = yInicial;
        this.yFinal = yFinal;
    }
    
    public double longitud(){
        double d;
        d = Math.sqrt(Math.pow(xFinal-xInicial, 2)+Math.pow(yFinal-yInicial, 2));
        return d;
    }
    
    public abstract double getArea();
    
    public abstract double getVolumen();

    public double getxInicial() {
        return xInicial;
    }

    public void setxInicial(double xInicial) {
        this.xInicial = xInicial;
    }

    public double getxFinal() {
        return xFinal;
    }

    public void setxFinal(double xFinal) {
        this.xFinal = xFinal;
    }

    public double getyInicial() {
        return yInicial;
    }

    public void setyInicial(double yInicial) {
        this.yInicial = yInicial;
    }

    public double getyFinal() {
        return yFinal;
    }

    public void setyFinal(double yFinal) {
        this.yFinal = yFinal;
    }

}
