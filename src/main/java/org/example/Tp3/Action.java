package org.example.Tp3;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Builder
@Data
@Getter
public class Action implements Subject{
    private String nom;
    private double prix;
    private List<Observer> observers;



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }
}
