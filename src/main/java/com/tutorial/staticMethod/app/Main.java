/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.staticMethod.app;
import java.util.ArrayList;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=mud0VZMR7Es&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=16
class Player{
    //menghitung jumlah player yang ada
    private static int countOfPlayer;
    String name;
    private static ArrayList<String> nameList = new ArrayList<String>();
    
    Player(String name){
        Player.countOfPlayer++;
        this.name = name;
        Player.nameList.add(this.name);
    }
    
    static void showCountOfPlayer(){
        System.out.println("Jumlah player = "+ Player.countOfPlayer);
    }
    
    static ArrayList<String> getNames(){
        return Player.nameList;
    }
    
}


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player objekPlayer1 = new Player("Naruto");
        Player objekPlayer2 = new Player("Sasuke");
        Player objekPlayer3 = new Player("Sakura");
        
        Player.showCountOfPlayer();
        System.out.println("Names = "+ Player.getNames());
    }
    
}
