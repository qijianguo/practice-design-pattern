package com.qijianguo.design.pattern.observer.custom;

/**
 * 实时温度、湿度布告板
 * @author qijianguo
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;

    private float humidity;

    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "%humidity");
    }
}
