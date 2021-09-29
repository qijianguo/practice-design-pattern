package com.qijianguo.design.pattern.proxy.remote.v2.server;

import java.io.Serializable;

/**
 * @author qijianguo
 */
public interface State extends Serializable {

    /**
     * 投币
     */
    default void insertQuarter() {
        throw new UnsupportedOperationException();
    }

    /**
     * 退币
     */
    default void ejectQuarter() {
        throw new UnsupportedOperationException();
    }

    /**
     * 摇动曲柄
     */
    default void turnCrank() {
        throw new UnsupportedOperationException();
    }

    /**
     * 发放
     */
    default void dispense() {
        throw new UnsupportedOperationException();
    }
}
