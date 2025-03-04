// https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/

import java.util.*;

abstract class Subject{
    abstract void addSubscriber();
    abstract void removeSubscriber();
}

public class WeatherStation extends Subject {
    List<Observer> observers;
    WeatherStation() {
        observers = new ArrayList<>();
    }
    void addSubscriber(Observer obs) {
        observers.add(obs);
    }
    void removeSubscriber(Observer obs) {
        observers.remove(obs);
    }
    void notifySubscribers() {
        for(Observer ob : observers)
            ob.notify();
    }
}

interface Observer{
    void notify();
}

class Phone extend Observer{
    void notify() {
        System.out.println("Received a notification on phone");
    }
}

class Television extend Observer{
    void notify() {
        System.out.println("Received a notification on television");
    }
}

class Main {
    public static void main(String[] args) {
        Observer ph = new Phone();
        Observer tv = new Television();

        Subject weatherStation = new WeatherStation();
        weatherStation.addSubscriber(ph);
        weatherStation.addSubscriber(tv);
        weatherStation.notify();
    }
}
