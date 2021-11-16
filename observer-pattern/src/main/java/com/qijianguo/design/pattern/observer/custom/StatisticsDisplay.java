package com.qijianguo.design.pattern.observer.custom;

/**
 * 统计布告板
 * @author qijianguo
 */
public class StatisticsDisplay implements DisplayElement, Observer {

    private Float max;

    private Float min;

    private float avg;

    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Min/Max temperature: " + avg + "/" + min + "/" + max );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
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
