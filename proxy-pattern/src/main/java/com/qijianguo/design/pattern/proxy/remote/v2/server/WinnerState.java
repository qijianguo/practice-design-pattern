package com.qijianguo.design.pattern.proxy.remote.v2.server;

public class WinnerState implements State {

    private transient StateMachine stateMachine;

    public WinnerState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        stateMachine.releaseCount();
        if (stateMachine.getCount() > 0) {
            stateMachine.releaseCount();
            if (stateMachine.getCount() > 0) {
                stateMachine.setState(stateMachine.getNoQuarterState());
                System.out.println("发放成功！\n请再次投币");
            } else {
                stateMachine.setState(stateMachine.getSoldOutState());
                System.out.println("发放成功！\n已售罄");
            }
        } else {
            stateMachine.setState(stateMachine.getSoldOutState());
            System.out.println("发放成功！\n已售罄");
        }
    }
}
