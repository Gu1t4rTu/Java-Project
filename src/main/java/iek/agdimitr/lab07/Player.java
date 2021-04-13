/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.lab07;

import java.util.Date;

/**
 *
 * @author User
 */
public class Player {
    private String firstName; //Όνομα Παίκτη
    private String lastName; //Επίθετο Παίκτη
    private Date birthDate; //Ημερομηνία Γέννησης Παίκτη
    
    public Player(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }    
    //TODO Να φτιάξω μέθοδο για υπολογισμό ηλικίας από ημερομηνία
    //TODO Να φτιάξω μέθοδο για προσθήκη καλαθιών
    
    
    public void printStats(){
        System.out.println("Fisrt Name :" + firstName);
        System.out.println("Last Name :" + lastName);
        System.out.println("Birth Date :" + birthDate);
    }
    
    public String toString(){
        return "First Name : " + firstName + "  Last Name : " + lastName + 
                ", Birth Date : " + birthDate;
    }
}
