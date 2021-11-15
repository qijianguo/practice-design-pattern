package com.qijianguo.design.pattern.compound.v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 被观察的对象
 * @author qijianguo
 */
public class Observable implements QuackObservable {

    List<Observer> observers = new ArrayList<>();

    /**
     * 观察的对象
     */
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer next = iterator.next();
            // 将对象duck通知给所有观察者
            next.update(duck);
        }
    }

    @Override
    public void removeObservers() {

    }
}
