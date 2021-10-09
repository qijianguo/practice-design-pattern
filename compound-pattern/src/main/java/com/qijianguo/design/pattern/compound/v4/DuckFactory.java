package com.qijianguo.design.pattern.compound.v4;

/**
 * 鸭子工厂实现
 * @author qijianguo
 */
public class DuckFactory extends AbstractDuckFactory {
    
    @Override
    Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    Quackable createMallardDuck() {
        return new MallardDuck();
    }
}
