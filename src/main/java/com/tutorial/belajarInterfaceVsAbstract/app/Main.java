/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.belajarInterfaceVsAbstract.app;
import com.tutorial.belajarInterfaceVsAbstract.Hero.HeroAgility;
import com.tutorial.belajarInterfaceVsAbstract.Hero.HeroIntel;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=hkNgCn8Yl08&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=37
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeroAgility hero1 = new HeroAgility("Ucup", 100);
        HeroIntel hero2 = new HeroIntel("Otong", 20);
        hero1.attack(hero2);
        hero2.spel(hero1);
        
    }
    
}
