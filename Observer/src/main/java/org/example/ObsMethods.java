package org.example;

public interface ObsMethods {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Game game);
}

