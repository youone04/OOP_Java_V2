/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.latihanEncapsulasi.app;

class Player{
    private int baseaHealth;
    private int baseAttack;
    private String name;
    private Weapon weapon;
    private Armor armor;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    
    public Player(String name){
        this.name = name;
        this.baseaHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        
    }
    
    private void levelUp(){
        
        this.level++;
    }
    
    public void display(){
        System.out.println("Player name : "+  this.name);
        System.out.println("Level : "+ this.level);
        System.out.println("Max Health : "+ this.maxHealth());
        System.out.println("Attack : "+ this.getAttackPower() + "\n");
    }
    public void setArmor(Armor armor){
        
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon){
        
        this.weapon = weapon;
        
    }
    public int maxHealth(){
        
        return this.baseaHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }
    public int getAttackPower(){
        
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;
    
    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }
    
    public int getStrength(){
        
        return this.strength;
    }
    
    public int getAddHealth(){
        
        return this.strength * 10 + this.health;
    }
}

class Weapon{
    private String name;
    private int attack;
    
    public Weapon(String name , int attack){
        
        this.name = name;
        this.attack = attack;
    }
    
    public int getAttack(){
        
        return this.attack;
    }
    
}

//https://www.youtube.com/watch?v=gI9dI0VG9YU&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=13
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player objekPlayer1 = new Player("intel");
        Armor objekArmor1 = new Armor("Baju besi", 5, 100);
        Weapon objekWeapon1 = new Weapon("Pedang", 10);
        objekPlayer1.setArmor(objekArmor1);
        objekPlayer1.setWeapon(objekWeapon1);
        
        
        Player objekPlayer2 = new Player("AMD");
        Armor objekArmor2 = new Armor("Jubah", 1, 40);
        Weapon objekWeapon2 = new Weapon("Pistol", 40);
        objekPlayer2.setArmor(objekArmor2);
        objekPlayer2.setWeapon(objekWeapon2);
        
        objekPlayer1.display();
        objekPlayer2.display();
    }
    
}
