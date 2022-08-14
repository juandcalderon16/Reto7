
package com.mycompany.reto7;

public class TramoAsfalto extends Tramo{
    
    private final double ANCHO = 8;
    private final double ESPESOR = 0.25;
    protected String proveedor;
    protected int velMaxima;
    protected boolean adelantar;
    
    public TramoAsfalto(int xInicial,int yInicial,int xFinal,int yFinal){
        super(xInicial, yInicial, xFinal, yFinal);
    }

    @Override
    public double area() {
        double d = ANCHO*this.longitud();
        return d;    }

    @Override
    public double volumen() {
        double d= ESPESOR*ANCHO*this.longitud();
        return d;    }
    
    
}
