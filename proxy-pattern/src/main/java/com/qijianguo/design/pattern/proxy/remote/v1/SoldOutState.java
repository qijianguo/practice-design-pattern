package com.qijianguo.design.pattern.proxy.remote.v1;

public class SoldOutState implements State {

    private StateMachine stateMachine;

    public SoldOutState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已售罄，无法投币！ERR");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已售罄，无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("已售罄，无法摇动曲柄！ERR");
    }

    @Override
    public void dispense() {
        System.out.println("已售罄，无法发放糖果！ERR");
    }
}
