package com.qijianguo.design.pattern.proxy.remote.v1;

/**
 * 糖果状态机
 * 基本功能：
 *      1.投币
 *      2.退币
 *      3.摇动曲柄
 *      4.发放糖果
 * v1：（StatePattern）：
 *      1.DoubleReward：每个玩家有10%的概率一次可以得到两个糖果
 *      2.填装糖果 {@link StateMachine#refill(int)}
 *
 * rmi：（ProxyPattern）
 *      1.添加监控信息，例如库存、状态等
 *
 *
 * @author qijianguo
 */
public class StateMachine {

    /**
     * 将‘所有状态’对象 组合 到当前‘Context’中
     */
    private State soldOutState, noQuarterState, hasQuarterState, soldState, winnerState;

    /**
     * 位置
     */
    private String location;

    /**
     * 当前状态
     */
    private State state;
    /**
     * 游戏剩余次数
     */
    private int count;

    private final int MAX = 10;

    public StateMachine(String location, int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
        this.count = count;
        this.location = location;
    }

    /**
     * 投币
     */
    public void insertQuarter() {
        System.out.println("准备投币");
        state.insertQuarter();
    }

    /**
     * 退币
     */
    public void ejectQuarter() {
        System.out.println("准备退币");
        state.ejectQuarter();
    }

    /**
     * 摇动曲柄
     */
    public void turnCrank() {
        System.out.println("准备摇动曲柄");
        state.turnCrank();
        dispense();
    }

    /**
     * 发放
     */
    public void dispense() {
        System.out.println("准备发放");
        state.dispense();
    }

    public void releaseCount() {
        System.out.println("发放糖果+1");
        if (count > 0) {
            count --;
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    /**
     * 装填糖果
     * @param count
     */
    public void refill(int count) {
        if (this.count + count < MAX) {
            this.count = this.count + count;
        } else {
            this.count = MAX;
        }
        this.state = noQuarterState;
    }

    public String getLocation() {
        return location;
    }
}
