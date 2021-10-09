package com.qijianguo.design.pattern.compound.v5;

/**
 * 鹅的适配器
 * 为了适配能够在{@link DuckSimulator} 中使用 {@link Quackable}
 *
 *
 * @author qijianguo
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    private int count;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.count = 0;
    }

    @Override
    public void quack() {
        this.goose.hook();
        this.count ++;
        printCount();
    }

    public void printCount() {
        System.out.printf("Goose honk count：%d times %n", this.count);
    }
}
