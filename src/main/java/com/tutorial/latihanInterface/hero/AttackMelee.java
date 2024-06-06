/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.latihanInterface.hero;

/**
 *
 * @author user
 */
public class AttackMelee implements IAttackSkill{
    private double power;
    
    public AttackMelee(double power){
        this.power = power;
    }
    public void attack(Hero enemy){
        System.out.println("Attack "+ enemy.getName()+" with melee "+ this.power);
    }
}
