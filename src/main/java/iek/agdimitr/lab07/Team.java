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
public class Team {
    
    private String name;
    private String color;
    private Player[] playerArray;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    public Team(String name, String color) {
        this.name = name;
        this.color = color;
        this.playerArray = new Player[5];
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", color=" + color +
                ", playerArray=" + playerArray + '}';
    }
    
    public void printPlayers(){
        System.out.println(this.getName() + " Players are : ");
        int i = playerArray.length;
        for (int x = 0; x < i; x++){
            System.out.println(playerArray[x]);
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
