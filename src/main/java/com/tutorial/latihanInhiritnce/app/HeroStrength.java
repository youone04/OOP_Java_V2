/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.latihanInhiritnce.app;

/**
 *
 * @author user
 */
public class HeroStrength extends Hero {
    String type = "Strength";
    
    //constructoe
    HeroStrength(String name , double attackPower, double health){
        super(name, attackPower , health);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type :"+ this.type);
    }
    
    @Override
    void takeDamage(double damage){
        System.out.println(this.name +" receive hal damage "+ damage + " - > "+ 0.5 * damage);
        this.health = this.health - 0.5 * damage;
    }
}
