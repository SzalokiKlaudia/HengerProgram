/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Klau
 */
public class TomorHenger extends Henger{
    
    private double fajSuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajSuly = 0;
    }
   

    public TomorHenger(double fajSuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajSuly = fajSuly;
    }
    
    public double getFajSuly(){
        
        return this.fajSuly;
    }
    
    public double suly(){
        
        double suly = super.terfogat() * this.fajSuly;
        return suly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajSuly=" + fajSuly + '}';
    }
    
    
    
    
    
    
}
