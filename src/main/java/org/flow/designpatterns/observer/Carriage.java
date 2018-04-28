package org.flow.designpatterns.observer;

import java.util.Observable;
// Shrek analogy :D

public class Carriage extends Observable {

    public void arrived(String stop) {
        setChanged();
        notifyObservers(stop);
    }
}