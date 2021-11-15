package com.qijianguo.design.pattern.strategy.v1;

/**
 * @author qijianguo
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with wings...");
    }
}
