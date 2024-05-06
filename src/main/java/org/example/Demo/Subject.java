package org.example.Demo;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    public void notifyObservers();
}
