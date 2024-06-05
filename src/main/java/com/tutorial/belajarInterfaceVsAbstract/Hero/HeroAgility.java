/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.belajarInterfaceVsAbstract.Hero;

/**
 *
 * @author user
 */
public class HeroAgility  extends Hero implements IAttackSkill {
    public HeroAgility(String name, double health){
        super(name, health);
    }
    
    public void attack(Hero enemy){
        System.out.println(this.getName() + " Menyerang "+ enemy.getName());
    }
}
