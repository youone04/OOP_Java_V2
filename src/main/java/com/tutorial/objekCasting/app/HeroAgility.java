/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.objekCasting.app;

/**
 *
 * @author user
 */
public class HeroAgility extends Hero {
    String type;
    
    public HeroAgility(String name, int health){
        super(name , health);
        this.type = "agility";
    }
    
    public void display(){
        System.out.println(this.getName() + " is an "+ this.type + " Hero");
    }
}
