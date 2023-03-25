package org.example;

public class Developer implements Observer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(Game game) {
        System.out.println("Developer " + name + ", new game: " + game.getTitle());
        System.out.println("Technical information: " + game.getTechInfo() + "\n");
    }
}
