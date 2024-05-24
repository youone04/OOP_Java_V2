/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.subClassConstructor.app;

/**
 *
 * @author user
 */

//sub class
public class HeroStrength extends Hero{
    
    HeroStrength(String name, double defencePower){
        super(name , defencePower);
      }
    
    HeroStrength(String name){
        super(name);
    }
    
    
}
