package com.ipl.management.model;

public class Player {
    private String id;
    private String name;
    private String team;
    private String role;
    private int runs;
    private int wickets;

    // Constructor
    public Player(String id, String name, String team, String role, int runs, int wickets) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getRuns() { return runs; }
    public void setRuns(int runs) { this.runs = runs; }

    public int getWickets() { return wickets; }
    public void setWickets(int wickets) { this.wickets = wickets; }

    // Display player details
    public void displayPlayerDetails() {
        System.out.println("Player ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Team: " + team);
        System.out.println("Role: " + role);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
    }
}
