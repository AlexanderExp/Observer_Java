package org.example;

public class Main {
    public static void main(String[] args) {
        GameConsole gameConsole = new GameConsole();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        Developer dev1 = new Developer("Dev 1");
        Developer dev2 = new Developer("Dev 2");

        Journalist jor1 = new Journalist("Jor 1");
        Journalist jor2 = new Journalist("Jor 2");

        gameConsole.registerObserver(player1);
        gameConsole.registerObserver(player2);

        gameConsole.registerObserver(dev1);
        gameConsole.registerObserver(dev2);

        gameConsole.registerObserver(jor1);
        gameConsole.registerObserver(jor2);

        gameConsole.newGame("Game 1", "invincible, Java adept", "required 1060ti", "Legendary game title");

        gameConsole.removeObserver(player1);

        gameConsole.removeObserver(dev2);

        gameConsole.removeObserver(jor1);

        gameConsole.newGame("Game 2", "Pacifist, Golden dog", "Intel processors only", "Non-optimized demo for 80$ us");
    }
}
