/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.latihanInhiritnce.app;

/**
 *
 * @author user
 */
public class Hero {
    //attribute
    String name;
    double attackPower, health;
    
    //constructor
    Hero(String name, double attackPower, double health){
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }
    
    void attack(Hero musuh){
        System.out.println("\n"+ this.name +" attacking "+ musuh.name);
        musuh.takeDamage(this.attackPower);
    }
    
    void takeDamage(double damage){
        System.out.println(this.name +" receive damage "+ damage);
        this.health = this.health - damage;
    }
    
    void display(){
        System.out.println("\nName :\t"+ this.name);
        System.out.println("Health :"+ this.health);
        System.out.println("Power :\t"+ this.attackPower);
    }
    
}
