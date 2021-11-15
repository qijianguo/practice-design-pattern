package com.qijianguo.design.pattern.compound.v4;

/**
 * 会计数的鸭子工厂
 *
 * @author qijianguo
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
}
