package com.ipl.management;

import com.ipl.management.controller.PlayerController;
import com.ipl.management.model.Player;
import com.ipl.management.view.PlayerView;

public class Main {
    public static void main(String[] args) {
        // Create some players
        Player player1 = new Player("P001", "Virat Kohli", "RCB", "Batsman", 10000, 0);
        Player player2 = new Player("P002", "AB de Villiers", "RCB", "Batsman", 8000, 0);
        Player player3 = new Player("P003", "Rashid Khan", "SRH", "Bowler", 0, 200);

        // Create the view and controller
        PlayerView playerView = new PlayerView();
        PlayerController playerController = new PlayerController(player1, playerView);

        // Test the system
        playerController.displayPlayerDetails(); // Display details of player1
        System.out.println("----- All Players -----");

        // Display all players in a team (e.g., RCB)
        Player[] players = {player1, player2, player3};
        playerController.displayTeamPlayers("RCB", players);
    }
}
