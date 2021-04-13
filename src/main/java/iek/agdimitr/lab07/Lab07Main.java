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
        Player player1 = null;
        brahamiPlayers[0] = player1;
        Player player2 = new Player("Γεώργιος", "Γεωργίου");
        brahamiPlayers[1] = player2;
        Player player3 = new Player("Βαγγέλης", "Καλογερόπουλος");
        brahamiPlayers[2] = player3;
        team1.setPlayerArray(brahamiPlayers);
        for (int i = 0; i <= 10; i++){
            player2.addPoint(i);
            player3.addPoint(i);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(team1);
        team1.printPlayers();
        
        System.out.println("Στον " + player2.getFirstName() + " " 
                            + player2.getLastName() + " Προστέθηκαν " +
                            player2.getPoints() + " Πόντοι ");
        
        System.out.println("Στον " + player3.getFirstName() + " "
                            + player3.getLastName() + " Προστέθηκαν " +
                            player3.getPoints() + " Πόντοι ");
    }
    
}
