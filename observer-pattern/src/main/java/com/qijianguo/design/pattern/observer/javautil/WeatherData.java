package com.qijianguo.design.pattern.observer.javautil;

import java.util.Observable;

/**
 * Java内置的观察者模式
 * @author qijianguo
 */
public class WeatherData extends Observable {

    private float temp;

    private float humidity;

    private float pressure;

    private void measurementsChanged() {
        // 1.先调用setChanged()方法，标记状态已经改变
        setChanged();
        // 2.通知所有观察者
        notifyObservers(this);
    }

    /**
     * 提供set方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
