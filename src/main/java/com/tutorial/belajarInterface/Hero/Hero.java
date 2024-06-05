/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.belajarInterface.Hero;

/**
 *
 * @author user
 */

public class Hero implements IAttack {
    private String name;
    private double health;
    
    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }
    
    //method wajid, karen implements interface attack
    public void Attack(Hero enemy){
        System.out.println(this.name + " Attack "+ enemy.name);
    }
    
    public void display(){
        System.out.println("Name : "+ this.name);
        System.out.println("Health : "+ this.health);
    }
}
