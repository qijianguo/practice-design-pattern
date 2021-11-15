package com.qijianguo.design.pattern.strategy.v1;

/**
 * @author qijianguo
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
