package com.qijianguo.design.pattern.state.v3;

public class NoQuarterState implements State {

    private int count = 0;

    private StateMachine stateMachine;

    public NoQuarterState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertQuarter() {
        stateMachine.setState(stateMachine.getHasQuarterState());
        System.out.println("投币成功！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("未投币，无法退币！ERR");
    }

    @Override
    public void turnCrank() {
        System.out.println("未投币，无法转动！ERR");
    }

    @Override
    public void dispense() {
        System.out.println("未投币，无法发放糖果！ERR");
    }
}
