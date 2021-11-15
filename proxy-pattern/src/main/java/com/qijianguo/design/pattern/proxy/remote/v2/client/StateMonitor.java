package com.qijianguo.design.pattern.proxy.remote.v2.client;

import com.qijianguo.design.pattern.proxy.remote.v2.server.StateMachineRemote;

import java.rmi.RemoteException;

/**
 * 状态监视器
 * @author qijianguo
 */
public class StateMonitor {

    private StateMachineRemote stateMachine;

    public StateMonitor(StateMachineRemote stateMachine) {
        this.stateMachine = stateMachine;
    }

    /**
     * 输出Machine的当前状态
     */
    public void report() {
        try {
            System.out.printf("Location: %s %nCount:%d %nState:%s", stateMachine.getLocation(), stateMachine.getCount(), stateMachine.getState().toString());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
