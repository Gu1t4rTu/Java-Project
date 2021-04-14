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
    private int points;
    
    public Player(String f, String l){
        this.firstName = f;
        this.lastName = l;
        this.points = 0;
    }    
    //TODO Να φτιάξω μέθοδο για υπολογισμό ηλικίας από ημερομηνία
    //TODO Να φτιάξω μέθοδο για προσθήκη καλαθιών
    
    
    public void printStats(){
        System.out.println("Fisrt Name :" + firstName);
        System.out.println("Last Name :" + lastName);
        System.out.println("Birth Date :" + birthDate);
    }
    
    @Override
    public String toString(){
        return "First Name: " + firstName + "  Last Name: " + lastName + 
                ", Birth Date: " + birthDate;
    }
    
    public void addPoint(){
        points++;
        System.out.println(" -> έχει " + points + " πόντους.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPoints() {
        return points;
    }
    
    public void removePoint(){
        if(points != 0){
            points--;
            System.out.println(" -> οι πόντοι τώρα είναι: " + points);
        }
        else{
            System.out.println(" -> Οι πόντοι είναι 0 δεν μπορεί να γίνει αφαίρεση.");
        }
    }
}
