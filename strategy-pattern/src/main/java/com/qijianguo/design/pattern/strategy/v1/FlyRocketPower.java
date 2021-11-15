package com.qijianguo.design.pattern.strategy.v1;

public class FlyRocketPower implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
