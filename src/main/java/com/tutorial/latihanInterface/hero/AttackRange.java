/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.latihanInterface.hero;

/**
 *
 * @author user
 */
public class AttackRange implements IAttackSkill {
    private double power;
    private double range;
    
    public AttackRange(double power, double range){
        
        this.power = power;
        this.range = range;
    }
    
    public void attack(Hero enemy){
        System.out.println("Attack "+ enemy.getName() +" with power "+ this.power+ " at range "+ this.range);
    }
}
