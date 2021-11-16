package com.qijianguo.design.pattern.decorator.v3;

import static com.qijianguo.design.pattern.decorator.v3.Beverage.*;

/**
 * @author qijianguo
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast(VENTI);
        System.out.println(darkRoast.description() + " ￥" + darkRoast.cost());
        // 加两份milk
        darkRoast = new Milk(new Milk(darkRoast));
        System.out.println(darkRoast.description() + " ￥" + darkRoast.cost());
        // 加一份Whip
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.description() + " ￥" + darkRoast.cost());
    }
}
