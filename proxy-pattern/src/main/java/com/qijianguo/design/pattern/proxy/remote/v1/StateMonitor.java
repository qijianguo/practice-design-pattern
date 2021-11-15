package com.qijianguo.design.pattern.proxy.remote.v1;

/**
 * 状态监视器
 * @author qijianguo
 */
public class StateMonitor {

    private StateMachine stateMachine;

    public StateMonitor(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    /**
     * 输出Machine的当前状态
     */
    public void report() {
        System.out.printf("Location: %s %nCount:%d %nState:%s", stateMachine.getLocation(), stateMachine.getCount(), stateMachine.getState().toString());
    }
}
