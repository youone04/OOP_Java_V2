/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.objekTheSuperclass.app;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero hero1 = new Hero("Ucup");
        hero1.display();
        
        //kita sebut Obeject sebagai super class
        Object hero2 = hero1;
        String heroStr1 = hero2.toString();
        String heroStr2 = hero2.toString();
        System.out.println(heroStr1);
        System.out.println(heroStr2);
        
        //salah satu method class Object adalah equals
        System.out.println(hero1.equals(hero2));
        
        //contoh dari equals
        Hero hero3 = new Hero("Otong");
        Hero hero4 = new Hero("Otong");
        Hero hero5 = new Hero("Otong");
        Jagoan hero6 = new Jagoan("Otong");
        
        
        //overide equals di class hero
        System.out.println(hero3.equals(hero4));
        System.out.println(hero3.equals(hero1));

        
        
    }
    
}
