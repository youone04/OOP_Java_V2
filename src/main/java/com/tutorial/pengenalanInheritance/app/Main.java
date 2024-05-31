/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.pengenalanInheritance.app;
import com.tutorial.pengenalanInheritance.app.Hero;
import com.tutorial.pengenalanInheritance.app.HeroStrenght;
/**
 *
 * @author user
 */
//https://www.youtube.com/waOqqe7zjo&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=20tch?v=CXqOqqe7zjo&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=20
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero hero = new Hero();
        Hero heroStrenght = new HeroStrenght();
        
        heroStrenght.name = "Ironman";
        hero.name = "ucup";
        
        hero.display();
        heroStrenght.display();
        System.out.println("Name "+ hero.name);
        System.out.println("Name "+ heroStrenght.name);
        
    }
    
}
