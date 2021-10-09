package com.qijianguo.design.pattern.compound.v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 组合：家禽群
 * 组合也需要和页节点实现相同的接口
 *      * 页节点：Quackable
 *      * 接口：Quackable.class
 *
 * 一般页节点中也会有add()方法，但是页节点的add()什么都不做
 * 好处：页节点和组合是透明的，客户无须区分两者，只管调用即可
 * 缺点：给Duck添加add()是无意义的，但是用户想调用Flock#add()就得确认Quackable对象是Flock类型的才可以调用
 * @author qijianguo
 */
public class Flock implements Quackable, QuackObservable {

    /**
     * 所有的 Quackable 对象
     */
    private List<Quackable> ducks = new ArrayList<>();

    private Observable observable;

    public Flock() {
        this.observable = new Observable(this);
    }

    public void add(Quackable duck) {
        this.ducks.add(duck);
    }

    @Override
    public void quack() {
        // TODO 迭代器模式
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.quack();
            notifyObservers();
        }
    }

    // 实现 QuackObservable 接口，观察整个 ducks 组

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    @Override
    public void removeObservers() {

    }
}
