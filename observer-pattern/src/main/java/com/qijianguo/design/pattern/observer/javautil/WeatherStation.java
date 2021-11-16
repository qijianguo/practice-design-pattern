package com.qijianguo.design.pattern.observer.javautil;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        new CurrentConditionsDisplay(observable);
        new StatisticsDisplay(observable);

        observable.setMeasurements(80f, 67f, 30f);
        observable.setMeasurements(81f, 66.2f, 30f);
        observable.setMeasurements(83f, 64f, 30f);
    }
}
