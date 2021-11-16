package com.qijianguo.design.pattern.observer.custom;

/**
 * 主题
 * @author qijianguo
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知已注册的观察者
     */
    void notifyObservers();

}
