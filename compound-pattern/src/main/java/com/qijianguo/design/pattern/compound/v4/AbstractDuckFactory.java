package com.qijianguo.design.pattern.compound.v4;

/**
 * @author qijianguo
 */
public abstract class AbstractDuckFactory {

    abstract Quackable createRubberDuck();

    abstract Quackable createRedHeadDuck();

    abstract Quackable createDuckCall();

    abstract Quackable createMallardDuck();

}
