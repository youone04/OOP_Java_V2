/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.latihanInterface.app;
import com.tutorial.latihanInterface.hero.HeroAgility;
import com.tutorial.latihanInterface.hero.AttackMelee;
import com.tutorial.latihanInterface.hero.AttackRange;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeroAgility hero1 = new HeroAgility("ucup", 100);
        HeroAgility hero2 = new HeroAgility("otong", 20);
        
        hero1.setAttackSkill(new AttackMelee(100));
        hero2.setAttackSkill(new AttackRange(100, 10));
        
        hero1.display();
        hero2.display();
        
        hero1.attack(hero2);
        hero2.attack(hero1);
    }
    
}
