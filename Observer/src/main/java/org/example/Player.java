package org.example;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(Game game) {
        System.out.println("Player " + name + ", new game: " + game.getTitle());
        System.out.println("Achievements: " + game.getAchievements() + "\n");
    }
}
