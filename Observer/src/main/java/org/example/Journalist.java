package org.example;

public class Journalist implements Observer {
    private String name;

    public Journalist(String name) {
        this.name = name;
    }

    @Override
    public void update(Game game) {
        System.out.println("Journalist " + name + ", new game: " + game.getTitle());
        System.out.println("Main Information : " + game.getMainInfo() + "\n");
    }
}
