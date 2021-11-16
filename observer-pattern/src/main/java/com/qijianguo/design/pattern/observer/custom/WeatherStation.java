package com.qijianguo.design.pattern.observer.custom;

/**
 * @author qijianguo
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData subject = new WeatherData();

        new CurrentConditionsDisplay(subject);
        new StatisticsDisplay(subject);

        subject.setMeasurements(80f, 67f, 30f);
        subject.setMeasurements(81f, 66.2f, 30f);
        subject.setMeasurements(83f, 64f, 30f);

    }
}
