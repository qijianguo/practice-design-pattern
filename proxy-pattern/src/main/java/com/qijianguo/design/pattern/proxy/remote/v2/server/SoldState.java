package com.qijianguo.design.pattern.proxy.remote.v2.server;

public class SoldState implements State {

    private transient StateMachine stateMachine;

    public SoldState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("正在发放，无法投币 ERR");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在发放，无法退币 ERR");
    }

    @Override
    public void turnCrank() {
        dispense();
    }

    @Override
    public void dispense() {
        stateMachine.releaseCount();
        if (stateMachine.getCount() > 0) {
            stateMachine.setState(stateMachine.getNoQuarterState());
            System.out.println("发放成功！\n请再次投币");
        } else {
            stateMachine.setState(stateMachine.getSoldOutState());
            System.out.println("发放成功！\n已售罄");
        }
    }
}
