package com.qijianguo.design.pattern.observer.javautil;

/**
 * 显示组件, 每个显示组件也是一个订阅者
 * @author qijianguo
 */
public interface DisplayElement {

    /**
     * 显示
     */
    void display();
}
