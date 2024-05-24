/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.latihanEncapsulasi2.app;

class Player{
    private int baseaHealth;
    private int baseAttack;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    //tambahan dari latihan 1
    private int totalDamage;
    //tambahan dari latihan 1
    private boolean isAlive;
    
    private String name;
    
//    objek member
    private Weapon weapon;
    private Armor armor;
    
    
    public Player(String name){
        this.name = name;
        this.baseaHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        //tambahan dari latihan 1
        this.isAlive = true;
        
    }
    
    private void levelUp(){
        
        this.level++;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public int getHealth(){
        
        return this.maxHealth() -this.totalDamage;
    }
    public void display(){
        System.out.println("Player name : "+  this.name);
        System.out.println("Level : "+ this.level);
        System.out.println("Health : "+ this.getHealth() +" /"+ this.maxHealth());
        System.out.println("Attack : "+ this.getAttackPower());
        //tambahan dari latihan 1
        System.out.println("Alive : "+ this.isAlive + "\n");
    }
    //tambahan dr latihan 1
    public void attack(Player musuh){
        //hitung damage
        int damage = this.getAttackPower();
        //print even
        System.out.println("Player name : "+  this.name + " is attacking "+ musuh.getName() +" with "+ damage);
        //attack musuh
        musuh.defence(damage);
        this.levelUp();

    }
    private int getAttackPower(){
        
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
    //tambahan dari latihan 1
    public void defence(int damage){
        
        //receive damage
        int defencePower = this.armor.defencePower();
        int deltaDamage;
        
        System.out.println(this.name + " Defence Power = "+ defencePower);

        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        }else{
            deltaDamage = 0;
        }
        System.out.println("Damage earned = "+ deltaDamage + "\n");
        //adding total damage
        this.totalDamage = this.totalDamage + deltaDamage;
        //check is alive
        if(this.getHealth() <= 0){
            this.isAlive = false;
            System.out.println("total ="+ this.maxHealth());
//            System.out.println("totalDamage "+ this.totalDamage);
            this.totalDamage = this.maxHealth();
//            System.out.println("totalDamage "+ this.totalDamage);

        }
        this.display();
        
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
    
    public int defencePower(){
        
        return this.getStrength() * 2;
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
//https://www.youtube.com/watch?v=IJT4VOyo1N8&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=14
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
        
        objekPlayer1.attack(objekPlayer2);
        objekPlayer2.attack(objekPlayer1);
        objekPlayer2.attack(objekPlayer1);

    }
    
}
