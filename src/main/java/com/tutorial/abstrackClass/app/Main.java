/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.abstrackClass.app;
import com.tutorial.abstrackClass.Hero.Hero;
import com.tutorial.abstrackClass.Hero.HeroIntel;
import com.tutorial.abstrackClass.Hero.HeroAgility;
import com.tutorial.abstrackClass.Hero.HeroStrength;



/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=7N3lxM05cw0&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=28
//https://www.youtube.com/watch?v=meuCc-RVGyI&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=29
//https://www.youtube.com/watch?v=9EfRK80X4pM&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=31
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
        //Hero hero3 = new Hero("ucup");
        //hero3.display();
        
        hero1.levelUp();
        hero2.levelUp();
        
        hero1.display();
        hero2.display();
        
        HeroStrength hero4 = new HeroStrength("kadal");
        hero4.levelUp();
        hero4.display();
        
    }
    
}
