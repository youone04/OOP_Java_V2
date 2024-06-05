/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.belajarInterfaceVsAbstract.Hero;

/**
 *
 * @author user
 */
public class HeroIntel extends Hero implements IAttackSkill,ISpellSkill{
    
    public HeroIntel(String name, double health){
        super(name ,health);
    }
    public void attack(Hero enemy){
        System.out.println(this.getName() + " Menyerang "+ enemy.getName());
    }
    
    public void spel(Hero enemy){
        System.out.println(this.getName() + " Memagic "+ enemy.getName());
    }
}
