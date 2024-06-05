/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.belajarInterfaceVsAbstract.Hero;

/**
 *
 * @author user
 */
public class Hero {
    private String name;
    private double health;
    
    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Health : "+ this.health);
    }
    
}
