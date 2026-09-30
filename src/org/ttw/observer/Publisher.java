package org.ttw.observer;

import org.ttw.observer.listener.Listener;

import java.util.HashSet;
import java.util.Set;

public class Publisher {
    Set<Listener> listeners = new HashSet<>();

    public void publish(){
        for (Listener listener: listeners){
            listener.listen();
        }
    }

    public void subscribe(Listener listener){
        listeners.add(listener);
    }
}
