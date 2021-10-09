package com.qijianguo.design.pattern.compound.v4;

/**
 * 鸭子模拟器
 * @author qijianguo
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();
        duckSimulator.simulate(duckFactory, gooseFactory);

    }

    public void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
        /*Quackable rubberDuck = new RubberDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        System.out.println(" \nDuck Simulator: ");
        simulate(rubberDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(mallardDuck);

        // 问题2：怎么才能让鸭子和鹅使用同一个{@link DuckSimulator} 呢？
        // 答案2: 采用装饰者模式

        System.out.println(" \nGoose Simulator: ");

        Quackable goose = new GooseAdapter(new Goose());
        goose.quack();*/
        
        
        // 问题3：如何在不修改鸭子类的情况下给鸭子一些其他的行为呢？
        // 答案3：采用装饰者模式
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());
//        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
//        Quackable duckCall = new QuackCounter(new DuckCall());
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        System.out.println(" \nDuck Simulator: ");
//        simulate(rubberDuck);
//        simulate(redHeadDuck);
//        simulate(duckCall);
//        simulate(mallardDuck);
//
//        System.out.println("The ducks quacked  " + QuackCounter.getCount() + " times");
//
//        System.out.println(" \nGoose Simulator: ");

        // 不计入鹅叫的次数，所以不包装鹅
//        Quackable goose = new GooseAdapter(new Goose());
//        goose.quack();

        // 问题4：为什么不将创建鸭子和鹅的程序集中在一个地方呢？
        // 答案4：采用工厂模式/抽象工厂模式
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        System.out.println(" \nDuck Simulator: ");
        simulate(rubberDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(mallardDuck);
        System.out.println("The ducks quacked  " + QuackCounter.getCount() + " times");

        // 用工厂模式创建鹅
        Goose innerGoose = gooseFactory.createInnerGoose();
        Goose outerGoose = gooseFactory.createOuterGoose();
        Quackable inner = new GooseAdapter(innerGoose);
        Quackable outer = new GooseAdapter(outerGoose);
        simulate(inner);
        simulate(outer);

        // TODO 问题5：每次都需要创建很多种鸭，还需要对鸭一一发出指令，太麻烦了...
        //  能不能一次创建一群鸭呢？并且可以给一群鸭发送同一指令...


    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
