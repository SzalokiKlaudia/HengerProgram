/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import classes.Cso;
import classes.Henger;
import classes.TomorHenger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Klau
 */
public class HengerProgram {
    
    private List<Henger> hengerek;

    public HengerProgram() {
        this.hengerek = new ArrayList<>();
    }
    
    public double atlagTerfogat(){
        
        double osszeg = 0;
        
        for (Henger henger : this.hengerek) {
            double terfogat = henger.terfogat();
            osszeg += terfogat;
      
        }
        double atlag = osszeg/ this.hengerek.size();
        
        return atlag;
        
    }
    
  public double csovekSulya() {
    double osszsuly = 0;
    for (Henger henger : this.hengerek) {
        if (henger instanceof Cso) { //ha a henger cső példányú akkor adja hozzá!
            osszsuly += ((Cso)henger).suly(); //típuskényszrítés h el tudjuk érni a cső metódusát (amit a tömörhengerből örököl)
        }
    }
    return osszsuly;
}
  
  public List<Henger> lista(){
      
      return this.hengerek;
      
      
  }
  
  public void run(){
      
      hengerek.add(new Henger(2.5,2.5));
      hengerek.add(new TomorHenger(4.5,7.5));
      hengerek.add(new TomorHenger(6, 3, 8.2));
      hengerek.add(new Cso(2, 4.3, 8.6));
      hengerek.add(new Cso(3, 5.2, 5.6, 7.8));
      
      System.out.println("Átlag térfogat: " + this.atlagTerfogat());
      System.out.println("Csövek súlya: " + this.csovekSulya());


  }
  
  
 
    public static void main(String[] args) {
        
        
        HengerProgram hengerProgram = new HengerProgram();
        hengerProgram.run();
    }
    
}
