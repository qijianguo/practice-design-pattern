package com.qijianguo.design.pattern.compound.v4;

/**
 * 绿头鸭
 * @author qijianguo
 */
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
