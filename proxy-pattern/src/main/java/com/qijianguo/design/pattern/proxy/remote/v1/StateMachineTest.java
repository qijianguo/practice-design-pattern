package com.qijianguo.design.pattern.proxy.remote.v1;

/**
 * 只能是本地监控
 * @author qijianguo
 */
public class StateMachineTest {

    public static void main(String[] args) {
        StateMachine sm = new StateMachine("abc", 1);

        StateMonitor stateMonitor = new StateMonitor(sm);
        // 调用report方法就可以打印当前的状态了...(这里只是本地监控，即监控代码和业务代码在同一个JVM中)
        stateMonitor.report();
    }
}
