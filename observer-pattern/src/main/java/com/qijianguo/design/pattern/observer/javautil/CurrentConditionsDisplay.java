package com.qijianguo.design.pattern.observer.javautil;

import java.util.Observable;
import java.util.Observer;

/**
 * 实时温度、湿度布告板
 * @author qijianguo
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private WeatherData weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemp() + "F degrees and " + weatherData.getHumidity() + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData) {
            weatherData = ((WeatherData) arg);
            display();
        }

    }
}
