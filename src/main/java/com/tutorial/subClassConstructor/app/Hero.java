/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.subClassConstructor.app;

/**
 *
 * @author user
 */
public class Hero {
    String name;
    double defencePower;
    
    Hero(String name, double defencePower){
        
        this.name = name;
        this.defencePower = defencePower;
    }
    
    Hero(String name){
        this.name = name;
    }
    
    void display(){
        
        System.out.println("Name : " + this.name);
        System.out.println("Defence power : "+ this.defencePower + "\n");
    }
}
