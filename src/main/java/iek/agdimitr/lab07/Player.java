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
    
    public String toString(){
        return "First Name: " + firstName + "  Last Name: " + lastName + 
                ", Birth Date: " + birthDate;
    }
    
    public void addPoint(int p){
        points = p;
        System.out.println("Οι πόντοι που προστέθηκαν είναι: " + points);
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
    
    public void removePoint(int p){
        if (points <= 0){
            points = 0; /*Θέτω ξανά τους πόντους με την τιμή 0 σε περίπτωση που
                          είναι αρνητικοί οι πόντοι*/
            System.out.println("Οι πόντοι είναι: " + points);
        }
        else if(points > 0){
            System.out.println("Οι πόντοι που θα αφιρεθούν είναι:" + p);
            points -= p;
            System.out.println("Οι πόντοι είναι: " + points);
        }
    }
}
