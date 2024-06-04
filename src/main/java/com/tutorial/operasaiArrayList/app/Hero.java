/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.operasaiArrayList.app;

/**
 *
 * @author user
 */
public class Hero {
    private String name;
    private double health;
    
    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }
    
    void setName(String name){
        this.name = name;
    }
    
        
    void display(){
         System.out.println("Name : "+ this.name + " with health "+ this.health);
    }
    
    public String toString(){
        return "Hero "+ this.name;
    }
}
