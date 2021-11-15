package com.qijianguo.design.pattern.compound.v6;

/**
 * 封装注册和通知的代码，并和{@link QuackObservable}组合在一起，这样QuackObservable所有的操作都委托给 {@link Observable} 类了
 *
 * 任何实现了Observer接口的对象都可以监听“嘎嘎叫”行为
 * @author qijianguo
 */
public interface Observer {

    void update(QuackObservable quackObservable);
}
