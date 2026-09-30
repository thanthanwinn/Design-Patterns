package org.ttw.observer;

import org.ttw.observer.listener.Listener1;
import org.ttw.observer.listener.Listener2;

public class ObserverDemo {

    public static void main(String[] arg){
        Publisher publisher = new Publisher();
        publisher.subscribe(new Listener1());
        publisher.subscribe(new Listener2());

        publisher.publish();
    }
}
