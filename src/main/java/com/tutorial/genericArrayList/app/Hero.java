/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.genericArrayList.app;

/**
 *
 * @author user
 */
public class Hero {
    private String name;
    private double health;
    
    Hero(String name , double health){
        this.name = name;
        this.health = health;
    }
    
    void setName(String newName){
        this.name = newName;
    }
    
    public void display(){
        System.out.println("name : "+this.name + " Health : "+ this.health);
    }
}
