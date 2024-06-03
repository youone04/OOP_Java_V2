/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.genericArrayList.app;
import java.util.ArrayList;
/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=GTjuHxcBeJg&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=32
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 20);
        HeroAgility agility = new HeroAgility("Jhony", 500);
        HeroIntel intel = new HeroIntel("Semith", 5);
        
        //aray sederhana
        Hero[] kumpulanHero = new Hero[3];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = agility;
        for(Hero hero:kumpulanHero){
            hero.display();
        }
        
        //array list
        ArrayList<Hero> listHero = new ArrayList<Hero>();
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agility);
        listHero.add(intel);
        System.out.println("\nList Hero\n");
        for(Hero hero:listHero){
            hero.display();
        }
        //reference
        agility.setName("Dudung");
        System.out.println("\nList Hero\n");        
        for(Hero hero:listHero){
            hero.display();
        }
        System.out.println("\nArray\n");
        for(Hero hero:kumpulanHero){
            hero.display();
        }
    }
    
}
