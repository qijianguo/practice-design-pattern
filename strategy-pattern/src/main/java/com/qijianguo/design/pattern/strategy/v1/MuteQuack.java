package com.qijianguo.design.pattern.strategy.v1;

/**
 * @author qijianguo
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
