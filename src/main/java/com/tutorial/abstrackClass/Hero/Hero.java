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
    
    public Hero(String name){
        this.name = name;
    }
    
    public void display(){
        System.out.println("Aku adalah "+ this.name);
    }
}
