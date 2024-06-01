/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.abstrackClass.Hero;

/**
 *
 * @author user
 */
public class HeroStrength extends Hero {
     public HeroStrength(String name){
        super(name);
    }
    
    public void levelUp(){
        this.setLevel(10);
    }
}
