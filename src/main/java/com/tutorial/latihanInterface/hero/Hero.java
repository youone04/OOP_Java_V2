/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.latihanInterface.hero;

/**
 *
 * @author user
 */
public abstract class Hero {
    private String name;
    private double health;
    private IAttackSkill attackSkill;
    
    public Hero(String name , double health){
        this.name = name;
        this.health = health;
    }
    public void attack(Hero enemy){
        System.out.println(this.name +" is attacking");
        this.attackSkill.attack(enemy);
    }
    public String getName(){
        return this.name;
    }
    
    public void setAttackSkill(IAttackSkill attackSkill){
        this.attackSkill = attackSkill;
    }
    
    public void display(){
        System.out.println("Name : "+ this.name);
        System.out.println("Healt : "+ this.health);
    }
    
}
