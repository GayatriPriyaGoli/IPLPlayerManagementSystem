package com.ipl.management.view;

import com.ipl.management.model.Player;

public class PlayerView {

    // Display player details
    public void displayPlayerDetails(Player player) {
        player.displayPlayerDetails();
    }

    // Display all players in a team
    public void displayTeamPlayers(String team, Player[] players) {
        System.out.println("Players from team: " + team);
        for (Player player : players) {
            if (player.getTeam().equalsIgnoreCase(team)) {
                player.displayPlayerDetails();
                System.out.println("--------------------------");
            }
        }
    }
}
