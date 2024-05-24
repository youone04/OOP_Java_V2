/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.subClassConstructor.app;
import com.tutorial.subClassConstructor.app.Hero;
import com.tutorial.subClassConstructor.app.HeroStrength;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=XHDA2qaTMw4&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=23
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hero hero = new Hero("Esmeralda", 10);
        hero.display();
        
        HeroStrength hero2 = new HeroStrength("Alucard");
        hero2.display();     
    }
    
}
