package com.qijianguo.design.pattern.compound.v1;

/**
 * 鸭子模拟器
 * @author qijianguo
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    public void simulate() {
        Quackable rubberDuck = new RubberDuck();
        Quackable readHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        System.out.println("Duck Simulator \n");
        simulate(rubberDuck);
        simulate(readHeadDuck);
        simulate(duckCall);
        simulate(mallardDuck);

        // TODO 问题2：怎么才能让鸭子和鹅使用同一个{@link DuckSimulator} 呢？

    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
