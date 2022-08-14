
package com.mycompany.reto7;

public class TramoSinAsfalto extends Tramo{
    
    private final double ANCHO = 6;
    protected double espesor;
    protected String material;
    
    public TramoSinAsfalto(int xInicial,int yInicial,int xFinal,int yFinal,double espesor){
        super(xInicial, yInicial, xFinal, yFinal);
        this.espesor = espesor;
    }
    
    
    @Override
    public double area() {
        double d = ANCHO*this.longitud();
        return d;    }

    @Override
    public double volumen() {
        double d= espesor*ANCHO*this.longitud();
        return d;    }
    
}
