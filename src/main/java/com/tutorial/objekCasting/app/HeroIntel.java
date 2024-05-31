/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.objekCasting.app;

/**
 *
 * @author user
 */
public class HeroIntel extends Hero {
    public String type;
    
    public HeroIntel(String name, int health){
        super(name , health);
        this.type = "intel";
    }
    
    public void display(){
        System.out.println(this.getName() + " is an "+ this.type + " Hero");
    }
    
    public void magichero(){
        System.out.println("Magic Hero");
    }
    
}
