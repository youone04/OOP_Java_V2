/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.belajarInterface.app;
import com.tutorial.belajarInterface.Hero.Hero;
/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=ztQPFMFEItI&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=36
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero hero1 = new Hero("ucup",100);
        Hero hero2 = new Hero("otong", 20);
  
        hero1.Attack(hero2);
    }
    
}
