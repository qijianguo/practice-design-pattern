package com.qijianguo.design.pattern.compound.v6;

/**
 * 绿头鸭
 * @author qijianguo
 */
public class MallardDuck implements Quackable, QuackObservable  {

    private Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void removeObservers() {
        observable.removeObservers();
    }
}
