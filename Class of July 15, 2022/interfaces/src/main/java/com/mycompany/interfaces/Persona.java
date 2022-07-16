/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author santi
 */
public class Persona extends Humano implements Actor {

    @Override
    public void action() {
        System.out.print("Estoy ladrando");
    }

    @Override
    public void actua() {
        System.out.print("Estoy actuando como persona");
    }
    
}
