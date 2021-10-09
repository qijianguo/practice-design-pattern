package com.qijianguo.design.pattern.compound.v2;

/**
 * 橡皮鸭
 * @author qijianguo
 */
public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
