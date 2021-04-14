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
        Team team1 = new Team("Brahami", "White");
        Player[] brahamiPlayers = new Player[3];
        Player player1 = new Player("Αντώνης", "Βασιλείου");
        brahamiPlayers[0] = player1;
        Player player2 = new Player("Γεώργιος", "Γεωργίου");
        brahamiPlayers[1] = player2;
        Player player3 = new Player("Βαγγέλης", "Καλογερόπουλος");
        brahamiPlayers[2] = player3;
        team1.setPlayerArray(brahamiPlayers);
        for (int i = 0; i < 10; i++) {
            
            System.out.println("=============================================");
            System.out.println("             Προσθήκη Πόντων");

            System.out.print(player1.getFirstName() + " " + player1.getLastName());
            player1.addPoint();

            System.out.print(player2.getFirstName() + " " + player2.getLastName());
            player2.addPoint();

            System.out.print(player3.getFirstName() + " " + player3.getLastName());
            player3.addPoint();
        }
        
        for (int i=0; i < 11; i++){
            
            System.out.println("=========================================================");
            System.out.println("                  Αφαίρεση Πόντων");
                    
            System.out.print(player1.getFirstName() + " " + player1.getLastName());
            player1.removePoint();
            
            System.out.print(player2.getFirstName() + " " + player2.getLastName());
            player2.removePoint();
            
            System.out.print(player3.getFirstName() + " " + player3.getLastName());
            player3.removePoint();
        }
    }
    
}
