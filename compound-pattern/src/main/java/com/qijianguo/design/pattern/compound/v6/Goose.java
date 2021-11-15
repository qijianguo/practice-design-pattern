package com.qijianguo.design.pattern.compound.v6;

/**
 * 鹅
 * 由于鹅和鸭在有一些相似的行为：例如：会飞、会叫、会游泳，但是两者又有一些差异，例如叫声不同...
 * 问题：怎么才能让鸭子和鹅使用同一个{@link DuckSimulator} 呢？
 *
 * 答案是适配器----
 * @author qijianguo
 */
public interface Goose {

    /**
     * 鹅的叫声
     */
    default void hook() {
        System.out.print("------Honk----\n");
    }
}
