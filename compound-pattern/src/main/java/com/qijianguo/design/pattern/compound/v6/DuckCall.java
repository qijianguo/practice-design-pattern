package com.qijianguo.design.pattern.compound.v6;

/**
 * 鸭鸣器
 * @author qijianguo
 */
public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
