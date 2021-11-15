package com.qijianguo.design.pattern.compound.v3;

/**
 * 鸭叫计数器：装饰者模式
 * @author qijianguo
 */
public class QuackCounter implements Quackable {

    private Quackable duck;
    /**
     * 统计叫的次数
     */
    private static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count ++;
    }

    public static int getCount() {
        return count;
    }
}
