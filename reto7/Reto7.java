
package com.mycompany.reto7;


public class Reto7 {

    public static void main(String[] args) {
        
        Tramo d = new TramoAsfalto(1,1,3,4);
        Tramo f = new TramoAsfalto(1,1,3,4);
        Tramo b = new TramoSinAsfalto(1,1,3,4,1.2);
        
        Carretera num = new Carretera();
        num.getVia().add(d);
        num.getVia().add(f);
        num.getVia().add(b);
        
        System.out.println(num.volumenTotal());
        System.out.println(num.areaTotal());
        System.out.println(num.longitudTotal());
        System.out.println(num.volumenAsfalto());
        System.out.println(num.volumenSinAsfalto());

        
        
    }
}
