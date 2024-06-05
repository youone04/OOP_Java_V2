/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.operasaiArrayList.app;
import java.util.ArrayList;
/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=nUmr7xTamBg&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=33
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 100);
        AgilityHero heroAgility = new AgilityHero("Dudung", 50);
        IntelHero heroIntel = new IntelHero("Jhony",20);
        
        ArrayList<Hero> listHero = new ArrayList<>();
        
        //operasi 1:  menambah member dengan add
        System.out.println("operasi 1: add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);
        System.out.println(listHero+"\n");
        
        //operasi 2: merubah member dengan set
        System.out.println("operasi 2: set");
        listHero.set(1, heroIntel);
        System.out.println(listHero+"\n");
        
       
        //operasi 3: menghapus member dengan remove
        System.out.println("operasi 3: remove");
        listHero.remove(1);
        System.out.println(listHero+"\n");
        
        //operasi 4: mengakses member
        System.out.println("operasi 4: get");
        System.out.println(listHero);
        Hero heroAmbil = listHero.get(0);
        System.out.println(listHero+"\n");
        heroAmbil.display();
        System.out.println();
        
        //method array list
        System.out.println("Macam macam method");
        System.out.println("1. size()\t :"+listHero.size());
        System.out.println("2. isEmpty()\t :"+listHero.isEmpty());
        System.out.println("3. contains(hero2)\t :"+listHero.contains(hero2));
        System.out.println(" contains(heroAgility)\t :"+listHero.contains(heroAgility));
        System.out.println("4. indexOf(hero1)\t :"+listHero.indexOf(hero1));
        System.out.println(" indexOf(heroAgility)\t :"+listHero.contains(heroAgility));
    }
    
}
