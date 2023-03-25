package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameConsole implements ObsMethods {
    private List<Observer> observers;
    private Game game;

    public GameConsole() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Game game) {
        for (Observer observer : observers) {
            observer.update(game);
        }
    }

    public void newGame(String title, String achievements, String techInfo, String mainInfo) {
        game = new Game(title, achievements, techInfo, mainInfo);
        notifyObservers(game);
    }
}
