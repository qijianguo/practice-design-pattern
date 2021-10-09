package com.qijianguo.design.pattern.compound.v6;

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
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable mallardDuck = duckFactory.createMallardDuck();
//        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        System.out.println(" \nDuck Simulator: ");
//        simulate(rubberDuck);
//        simulate(redHeadDuck);
//        simulate(duckCall);
//        simulate(mallardDuck);
//        System.out.println("The ducks quacked  " + QuackCounter.getCount() + " times");

        // 用工厂模式创建鹅
//        Goose innerGoose = gooseFactory.createInnerGoose();
//        Goose outerGoose = gooseFactory.createOuterGoose();
//        Quackable inner = new GooseAdapter(innerGoose);
//        Quackable outer = new GooseAdapter(outerGoose);
//        simulate(inner);
//        simulate(outer);

        // 问题5：每次都需要创建很多种鸭，还需要对鸭一一发出指令，太麻烦了...
        //  能不能一次创建一群鸭呢？并且可以给一群鸭发送同一指令...
        // 答案是：组合模式 + 迭代器模式
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        System.out.println(" \nDuck Simulator: ");
        System.out.println("----------------混合鸭群-----------------");
        Flock fixDucks = new Flock();
        fixDucks.add(duckCall);
        fixDucks.add(mallardDuck);
        fixDucks.add(redHeadDuck);
        fixDucks.add(rubberDuck);
        // 给“fixDucks”统一发送“叫”的指令
        simulate(fixDucks);

        System.out.println("----------------绿头鸭群-----------------");
        // 也可以创建多个Flock，用于装不同类型的鸭子
        Flock mallardDucks = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        mallardDucks.add(mallardDuck1);
        mallardDucks.add(mallardDuck2);
        mallardDucks.add(mallardDuck3);
        mallardDucks.add(mallardDuck4);
        // 给“mallardDucks”统一发送“叫”的指令
        simulate(mallardDucks);

        System.out.println("The ducks quacked  " + QuackCounter.getCount() + " times");

        // 问题6：怎么能监听每只鸭子的行为，做到实时监听部分鸭子的“嘎嘎叫”行为呢？
        // 答案6：观察者模式  ① 将鸭子作为被观察者，②注册观察者并添加到观察者组

        // 创建观察者
        Quackologist quackologist = new Quackologist();
        // 注册观察者到观察者组
        mallardDucks.registerObserver(quackologist);

        System.out.println("----------------");
        // 给“mallardDucks”统一发送“叫”的指令
        simulate(mallardDucks);


    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
