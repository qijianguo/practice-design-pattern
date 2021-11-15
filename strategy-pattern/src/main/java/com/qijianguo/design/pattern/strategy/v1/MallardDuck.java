package com.qijianguo.design.pattern.strategy.v1;

/**
 * @author qijianguo
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("i'm a real Mallard duck");
    }

}
