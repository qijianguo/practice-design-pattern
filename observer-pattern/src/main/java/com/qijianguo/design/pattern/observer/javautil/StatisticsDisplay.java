package com.qijianguo.design.pattern.observer.javautil;

import java.util.Observable;
import java.util.Observer;

/**
 * 统计布告板
 * @author qijianguo
 */
public class StatisticsDisplay implements DisplayElement, Observer {

    private Float max;

    private Float min;

    private float avg;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Min/Max temperature: " + avg + "/" + min + "/" + max );
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            float temp = data.getTemp();
            if (min == null) {
                min = temp;
            } else {
                if (min > temp) {
                    min = temp;
                }
            }
            if (max == null) {
                max = temp;
            } else {
                if (max < temp) {
                    max = temp;
                }
            }
            avg = (min + max) / 2;
            display();
        }
    }

}
