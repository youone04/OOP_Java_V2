/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.latihanInhiritnce.app;
import com.tutorial.latihanInhiritnce.app.Hero;
import com.tutorial.latihanInhiritnce.app.HeroStrength;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=3s-RAtdv5Oo&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=25
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hero hero1 = new Hero("Ucup", 10, 100);
        HeroStrength hero2 = new HeroStrength("Ironman", 20, 100); 
        hero1.display();
        hero2.display();
        hero1.attack(hero2);
        hero2.attack(hero1);
        
        hero1.display();
        hero2.display();
    }
    
}
