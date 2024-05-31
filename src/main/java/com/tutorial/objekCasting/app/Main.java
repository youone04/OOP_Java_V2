/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.objekCasting.app;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=MoIORVH4LwI&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=27
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        casting biasa
            double angka = 5.5;
            System.out.println("sebelum casting "+ angka);
            int angkaHasil = (int) angka;
            System.out.println("setelah casting "+ angkaHasil);
            
          //casting objek
          
          //objek dengan calss HeroIntel
          HeroIntel hero1 = new HeroIntel("ucup", 100);
          hero1.display();
          
          //casing up, child cas to parent
          Hero heroUp = (Hero) hero1;
          heroUp.display();
          //ada field yang hilangg
//          System.out.println(""+heroUp.type);
//          heroUp.heroMagic()

            Hero heroReg = new Hero("otong", 100);
            heroReg.display();
            
            //tidak bisa down casting dari child class ke parent
//            HeroIntel heroDown = (HeroIntel) heroReg;

            //dari intel ke hero biasa, dan balikan lagi ke intel
            HeroIntel hero2 = (HeroIntel) heroUp;
            hero2.magichero();

    }
    
}
