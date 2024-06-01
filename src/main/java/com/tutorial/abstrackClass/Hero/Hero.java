/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.abstrackClass.Hero;

/**
 *
 * @author user
 */
public abstract class Hero {
    private String name;
    private int level;
    
    public Hero(String name){
        this.name = name;
        this.level = 1;
    }
    
    public void display(){
        System.out.println("Aku adalah "+ this.name);
        System.out.println("Level "+ this.level);
    }
    
    //method abstrack
    public abstract void levelUp();
    
    //setter
    public void setLevel(int level){
        this.level += level;
    }
}
