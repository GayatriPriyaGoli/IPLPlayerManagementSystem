package com.ipl.management.controller;

import com.ipl.management.model.Player;
import com.ipl.management.view.PlayerView;

public class PlayerController {
    private Player model;
    private PlayerView view;

    // Constructor
    public PlayerController(Player model, PlayerView view) {
        this.model = model;
        this.view = view;
    }

    // Display player details
    public void displayPlayerDetails() {
        view.displayPlayerDetails(model);
    }

    // Display all players in a team
    public void displayTeamPlayers(String team, Player[] players) {
        view.displayTeamPlayers(team, players);
    }

    // Add a player (simple example)
    public void addPlayer(String id, String name, String team, String role, int runs, int wickets) {
        model.setId(id);
        model.setName(name);
        model.setTeam(team);
        model.setRole(role);
        model.setRuns(runs);
        model.setWickets(wickets);
        displayPlayerDetails();
    }
}
