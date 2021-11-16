package com.qijianguo.design.pattern.decorator.v2;

/**
 * @author qijianguo
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.description() + " ￥" + darkRoast.cost());
        // 加两份milk
        darkRoast = new Milk(new Milk(darkRoast));
        System.out.println(darkRoast.description() + " ￥" + darkRoast.cost());
        // 加一份Whip
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.description() + " ￥" + darkRoast.cost());
    }
}
