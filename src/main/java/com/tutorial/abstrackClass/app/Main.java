/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.abstrackClass.app;
import com.tutorial.abstrackClass.Hero.Hero;
import com.tutorial.abstrackClass.Hero.HeroIntel;
import com.tutorial.abstrackClass.Hero.HeroAgility;



/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=7N3lxM05cw0&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=28
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat objek dari kelas non abstact
        HeroIntel hero1 = new HeroIntel("otong");
        hero1.display();
        
        HeroAgility hero2  = new HeroAgility("Mario");
        hero2.display();
        
        //membuat objek dari kelas abstract
        //tidak bisa membuat objek dari classa abstract
//        Hero hero3 = new Hero("ucup");
//        hero3.display();
        
    }
    
}