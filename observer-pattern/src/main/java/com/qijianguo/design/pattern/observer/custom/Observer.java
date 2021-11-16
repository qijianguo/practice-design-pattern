package com.qijianguo.design.pattern.observer.custom;

/**
 * 观察者
 * @author qijianguo
 */
public interface Observer {

    /**
     * 更新数据
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temp, float humidity, float pressure);
}
