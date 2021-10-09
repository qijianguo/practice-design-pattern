package com.qijianguo.design.pattern.compound.v6;

/**
 * 任何想被观察的对象必须实现当前接口
 *
 * 例如：想要被观察「绿头鸭{@link MallardDuck}」 ，则 要实现当前接口
 * @author qijianguo
 */
public interface QuackObservable {

    /**
     * 注册监听对象
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 通知监听对象
     */
    void notifyObservers();

    /**观察者
     * 移除所有
     */
    void removeObservers();

}
