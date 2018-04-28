package org.flow.designpatterns.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Character shrek = new Character("Shrek", "Swamp");
        Character donkey = new Character("Donkey", "Far and Away");
        Character frodo = new Character("Mr. Frodo", "Mordor");

        Carriage carriage = new Carriage();

        carriage.addObserver(shrek);
        carriage.addObserver(donkey);
        carriage.addObserver(frodo);
        carriage.arrived("Rivendell");
        carriage.arrived("Moria");
        carriage.arrived("Far and Away");
        carriage.arrived("Swamp");
        carriage.arrived("Mordor");

    }


}
