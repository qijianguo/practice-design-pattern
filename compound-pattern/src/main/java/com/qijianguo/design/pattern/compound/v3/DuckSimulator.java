package com.qijianguo.design.pattern.compound.v3;

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
        /*Quackable rubberDuck = new RubberDuck();
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
        goose.quack();*/
        
        
        // 问题3：如何在不修改鸭子类的情况下给鸭子一些其他的行为呢？
        // 答案3：采用装饰者模式
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable readHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        System.out.println(" \nDuck Simulator: ");
        simulate(rubberDuck);
        simulate(readHeadDuck);
        simulate(duckCall);
        simulate(mallardDuck);

        System.out.println("The ducks quacked  " + QuackCounter.getCount() + " times");

        System.out.println(" \nGoose Simulator: ");

        // 不计入鹅叫的次数，所以不包装鹅
        Quackable goose = new GooseAdapter(new Goose());
        goose.quack();

        // TODO 问题4：为什么不将创建鸭子和鹅的程序集中在一个地方呢？



    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
