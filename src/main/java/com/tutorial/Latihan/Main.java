/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.Latihan;

/**
 *
 * @author user
 */
//player
class Player{
    String name;
    double health;
    int level;
    
    //objects member
    Weapon weapon;
    Armor armor;
    
    //constructor
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    
    void display(){
        System.out.println("player name : "+ this.name);
        System.out.println("Healt : "+ this.health + " HP");
    }
}

//senjata
class Weapon{
    double attackPower;
    String name;
    
    //constructor
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    
    void display(){
        System.out.println("Weapon : "+ this.name + " , Attack : "+ this.attackPower );
    }
}

//armor
class Armor{
    double defencePower;
    String name;
    
    //constuctor
    Armor(String name , double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    
    void display(){
        System.out.println("Armor : "+ this.name + " , Defence : "+ this.defencePower);
    }
}
//https://www.youtube.com/watch?v=bFVfaWXGTYs&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=8
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objek player 1
        Player player1 = new Player("Ucup", 1);
        Player player2 = new Player("Sanji", 1);

        
        //objek weapon
        Weapon pedang = new Weapon("pedang",15);
        Weapon pistol = new Weapon("pistol",25);

        
        //objek armor
        Armor bajuBesi = new Armor("baju besi",10);
        
        //equip senjata dan armor 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.weapon.display();
        player1.armor.display();
        player1.display();
        
        System.out.println("\n");
        
        //equip senjata dan armor 2
        player2.equipWeapon(pistol);
        player2.equipArmor(bajuBesi);
        player2.weapon.display();
        player2.armor.display();
        player2.display();
    }
    
}
