package org.example.Demo;

import java.util.ArrayList;
import java.util.List;

public class TraficStation implements Subject {
    private List<Observer> observers;
    private TraficInfo traficInfo;

    public TraficStation() {
        observers = new ArrayList<>();
    }

    public void updateTraficInfo(TraficInfo traficInfo) {
        this.traficInfo = traficInfo;
        notifyObservers();
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
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(traficInfo));
    }
}
