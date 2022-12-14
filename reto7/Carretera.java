
package com.mycompany.reto7;

import java.util.ArrayList;

/**
 *
 * @author yojua
 */
public class Carretera {
    
    private ArrayList<Tramo> via;
    
    public Carretera(){
        via = new ArrayList<>();
    }
    
    public double longitudTotal(){
        double d = 0;
        for(Tramo tramo:via){
            d = d + tramo.longitud();
        }
        return d;
    }
    
    public double areaTotal(){
        double d = 0;
        for(Tramo tramo:via){
            d = d + tramo.area();
            
        }
        return d;
    }
    
    public double volumenTotal(){
        double d = 0;
        for(Tramo tramo:via){
            d = d + tramo.volumen();
            
        }
        return d;
    }
    
    public double volumenAsfalto(){
        double d = 0;
        for(Tramo tramo:via){
            if(tramo.getClass().getSimpleName().equals("TramoAsfalto")){
            d = d + tramo.volumen();}    
        }
        return d;
        }
    
    public double volumenSinAsfalto(){
        double d = 0;
        for(Tramo tramo:via){
            if(tramo.getClass().getSimpleName().equals("TramoSinAsfalto")){
            d = d + tramo.volumen();}    
        }
        return d;
        }
    
    public boolean conexion(){
        if(via.isEmpty())return false;
        double cont = 0;
        for(int i = 0;i<via.size()-1;i++){
            if(via.get(i).getxFinal()==via.get(i+1).getxInicial() && via.get(i).getyFinal()==via.get(i+1).getyInicial()){
                cont ++;
            }
        }
        return cont==(via.size()-1);
        }
    
        
    public ArrayList<Tramo> getVia() {
        return via;
    }

    public void setVia(ArrayList<Tramo> via) {
        this.via = via;
    }
    
    
}
