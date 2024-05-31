/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.objekCasting.app;

/**
 *
 * @author user
 */
public class Hero {
    private String name;
    private int health;
    String test;
    
    Hero(String name, int health){
        this.name = name;
        this.health = health;
    }
    
    public double getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void display(){
        System.out.println(this.name +" Is regular hero");
    }
}
