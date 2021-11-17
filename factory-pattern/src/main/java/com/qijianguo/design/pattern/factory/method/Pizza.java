package com.qijianguo.design.pattern.factory.method;

/**
 * @author qijianguo
 */
public abstract class Pizza {

    void prepare() {
        System.out.println("prepare...");
    }

    void back() {
        System.out.println("back...");
    }

    void cut() {
        System.out.println("cut...");
    }

    void box() {
        System.out.println("box...");
    }

}
