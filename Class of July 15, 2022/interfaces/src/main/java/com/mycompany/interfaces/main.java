/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class main {
    
    public static void main(String args[]){
        
        ArrayList<Actor> listaTipo = new ArrayList<>();
        
        listaTipo.add(new Perro());
        listaTipo.add(new Persona());
        
        for(int i = 0; i <= 1; i++){
            listaTipo.get(i).actua();
        }
        
    }
    
}
