package com.qijianguo.design.pattern.compound.v2;

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
        System.out.println(" \nDuck Simulator: ");
        simulate(rubberDuck);
        simulate(readHeadDuck);
        simulate(duckCall);
        simulate(mallardDuck);

        // 问题2：怎么才能让鸭子和鹅使用同一个{@link DuckSimulator} 呢？
        // 答案2: 采用装饰者模式

        System.out.println(" \nGoose Simulator: ");

        Quackable goose = new GooseAdapter(new Goose());
        goose.quack();

        // TODO 问题3：如何在不修改鸭子类的情况下给鸭子一些其他的行为呢？


    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
