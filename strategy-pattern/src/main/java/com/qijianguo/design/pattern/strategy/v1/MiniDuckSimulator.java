package com.qijianguo.design.pattern.strategy.v1;

/**
 * @author qijianguo
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        // 构造器
        Duck duck = new MallardDuck();

        duck.display();
        duck.swim();
        duck.performFlay();
        duck.performQuack();

        // 修改行为
        duck.setFlyBehavior(new FlyRocketPower());
        duck.performFlay();
    }

}
