
package com.mycompany.reto7;


public class Reto7 {

    public static void main(String[] args) {
        
        Tramo d = new TramoAsfalto(1,1,3,5, "Pedro", 80, true);
        Tramo f = new TramoSinAsfalto(3,5,5,5, 0.4, "Piedras");
        Tramo e = new TramoAsfalto(5,5,5,1, "Juan", 50, false);
        Tramo g = new TramoSinAsfalto(5,1,1,1, 0.18, "Arena");
        
        
        Carretera num = new Carretera();
        num.getVia().add(d);
        num.getVia().add(f);
        num.getVia().add(e);
        num.getVia().add(g);
        
        System.out.println("Longitud del tramo d: " + d.longitud());
        System.out.println("Volumen del tramo f: " + f.volumen());
        System.out.println("Area del tramo e: " + e.area());
        System.out.println("Volumen total: " + num.volumenTotal());
        System.out.println("Area total: " + num.areaTotal());
        System.out.println("Longitud total: " + num.longitudTotal());
        System.out.println("Volumen de tramos con asfalto: " + num.volumenAsfalto());
        System.out.println("Volumen de tramos sin asfalto: " + num.volumenSinAsfalto());
        System.out.println("¿Hay tramos conectados? " + num.conexion());

        
        
    }
}
