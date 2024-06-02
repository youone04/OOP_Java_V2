/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.objekTheSuperclass.app;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=9EfRK80X4pM&list=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=32
public class Hero extends Object {
    private String name;
    public Hero(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name : "+ this.name);
    }
    public boolean equals(Object otherObject){
        if(this == otherObject){
            System.out.println("Object dengan reference sama");
            return true;
        }else if (this.getClass() == otherObject.getClass()){
            System.out.println("Object dengan class sama");
            System.out.println("Refrence berbeda");
            
            Hero other = (Hero) otherObject;
            if(this.name == other.name){
                System.out.println("Namanya sama");
                return true;
            }else{
                System.out.println("Namanya beda");
                return false;

            }
        }else{
            return false;
        }
    }
}
