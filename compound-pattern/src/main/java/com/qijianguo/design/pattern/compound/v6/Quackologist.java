package com.qijianguo.design.pattern.compound.v6;

/**
 * 监听所有的 {@link QuackObservable} 对象
 * @author qijianguo
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist: " + quackObservable + " just quacked.");
    }
}
