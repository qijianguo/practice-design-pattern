package com.qijianguo.design.pattern.proxy.remote.v1;

import java.util.Random;

public class HasQuarterState implements State {

    private StateMachine stateMachine;

    public HasQuarterState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币，无法重复投币！ERR");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已投币，退币成功！");
        stateMachine.setState(stateMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("开始摇动驱动...");
        // 1.判断是否进行双倍奖励
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0 && stateMachine.getCount() > 1) {
            stateMachine.setState(stateMachine.getWinnerState());
        } else {
            stateMachine.setState(stateMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("已投币，请先摇动曲柄 ERR");
    }
}
