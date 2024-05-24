/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial.overLoading.app;

/**
 *
 * @author user
 */

class Player{
    
//    integer dan integer
    static int tambah(int nilai1 , int nilai2){
        
        return nilai1 + nilai2;
    }
    
    static double tambah(double nilai1, int nilai2){
        //convert int to double
        double nilai = (double) nilai1;
        
        return nilai + nilai2;
    }
    
    static double tambah(double nilai1 , double nilai2){
        
        return nilai1 +  nilai2;
    }
}

//https://www.youtube.com/watch?v=TTt6v_be0Vk&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=19
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hasil = "+ Player.tambah(10, 20));
        System.out.println("hasil = "+ Player.tambah(1.8, 1));
    }
    
}
