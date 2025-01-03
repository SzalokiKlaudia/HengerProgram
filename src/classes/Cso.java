/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Klau
 */
public class Cso extends TomorHenger{
    
    private double falvastagsag;

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double falvastagsag, double fajSuly, double sugar, double magassag) {
        super(fajSuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

  
    public double getFalvastagsag(){
        
        return this.falvastagsag;
    }
    
    @Override
    public double terfogat(){//ki kell számolni a kis kör sugarát, úgy hogy kivonjuk a külső kör sugarából a falvastagságot
                                //íg kaptuk meg a kis kör sugarát, majd ez alapján kiszámoljuk a csőnek a térfogatát
        
        double sugarBelso = super.getSugar() - this.falvastagsag;
        double belsoSugarTerfogat = sugarBelso * sugarBelso * Math.PI * super.getMagassag();
        
        return super.terfogat() - belsoSugarTerfogat;
        
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
    
    
    
    
    
}
