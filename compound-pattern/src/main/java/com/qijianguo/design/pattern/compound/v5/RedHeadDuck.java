package com.qijianguo.design.pattern.compound.v5;

/**
 * 红头鸭
 * @author qijianguo
 */
public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
