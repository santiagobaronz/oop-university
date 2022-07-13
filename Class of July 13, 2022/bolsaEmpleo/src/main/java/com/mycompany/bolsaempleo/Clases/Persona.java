/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolsaempleo.Clases;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Persona {
    
    public String name;
    public String lastName;
    public String email;
    private String phoneNumber;
    public String age;
    private String idNumber;
    private String gender;
    private String educationPlace;
    
    
    private String degree;
    private String startDateDegree;
    private String endDateDegree;
    private String lastCompany;
    
    private String startLastJob;
    private String endLastJob;
    public String yearsOfExperience;
    private String positionLastJob;
    public String profession;
    
    public Persona(String name, String lastName, String email, String phoneNumber,
                    String age, String idNumber,String profession, String gender, String educationPlace,
                    String degree, String startDateDegree, String endDateDegree,
                    String lastCompany, String startLastJob, String endLastJob,
                    String yearsOfExperience, String positionLastJob){
    
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.idNumber = idNumber;
        this.profession = profession;
        this.gender = gender;
        this.educationPlace = educationPlace;
        this.degree = degree;
        this.startDateDegree = startDateDegree;
        this.endDateDegree = endDateDegree;
        this.lastCompany = lastCompany;
        this.startLastJob = startLastJob;
        this.endLastJob = endLastJob;
        this.yearsOfExperience = yearsOfExperience; 
        
    }
    
}
