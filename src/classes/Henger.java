/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Klau
 */
public class Henger {
    
    private static int hengerDarab = 0;
    private double sugar;
    private double magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDarab++;
    }
    
    public static int getHengerDarab(){
        
        return hengerDarab;
    }
    
    public double getSugar(){
        
        return this.sugar;
    }
    
    public double getMagassag(){
        return this.magassag;
    }
    
    public double terfogat(){
        double terfogat = sugar * sugar * Math.PI * magassag;
        
        return terfogat;
       
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    
    
}
