/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.lab07;

/**
 *
 * @author User
 */
public class Lab07Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player("Έξω", "Φυλαρούχας");
        player1.printStats();
        System.out.println(player1);
        player1.toString();
    }
    
}
