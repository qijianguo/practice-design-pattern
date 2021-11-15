package com.qijianguo.design.pattern.state.v2;

/**
 * 糖果状态机
 * 新需求：
 *  1.每个玩家有10%的概率一次得到两个糖果
 * @author qijianguo
 */
public class StateMachine {

    /**
     * 售罄
     */
    public static final int SOLD_OUT = 0;
    /**
     * 未投币
     */
    public static final int NO_QUARTER = 1;
    /**
     * 已投币
     */
    public static final int HAS_QUARTER = 2;
    /**
     * 已售出
     */
    public static final int SOLD = 3;
    /**
     * 当前状态
     */
    private int state;
    /**
     * 游戏剩余次数
     */
    private int count;

    // 新增加
    private int winner;

    public StateMachine(int count, int winner) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        } else {
            this.state = SOLD_OUT;
        }
        this.winner = winner;
    }


    /**
     * 投币
     */
    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("已售罄，无法投币！ERR");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("投币成功!");
                break;
            case HAS_QUARTER:
                System.out.println("有币了，无法重复投币！ERR");
                break;
            case SOLD:
                System.out.println("正在开奖，无法投币！ERR");
                break;
        }
    }

    /**
     * 退币
     */
    public void ejectQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.err.println("无法退币，已售罄！");
                break;
            case NO_QUARTER:
                System.err.println("没有可以退还的币！");
                break;
            case HAS_QUARTER:
                state = NO_QUARTER;
                System.out.println("退币成功！");
                break;
            case SOLD:
                System.err.println("正在开奖，无法退币！");
                break;
        }
    }

    /**
     * 摇动曲柄
     */
    public void turnCrank() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("已售罄，无法摇动曲柄！ERR");
                break;
            case NO_QUARTER:
                System.out.println("未投币，无法摇动曲柄！ERR");
                break;
            case HAS_QUARTER:
                state = SOLD;
                System.out.println("正在发放糖果");
                dispense();
                break;
            case SOLD:
                System.out.println("正在开奖, 无法摇动曲柄！ERR");
                break;
        }
    }

    /**
     * 发放
     */
    public void dispense() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("已售罄，无法发放糖果！ERR");
                break;
            case NO_QUARTER:
                System.out.println("未投币，无法发放糖果！ERR");
                break;
            case HAS_QUARTER:
                System.out.println("已投币, 无法发放糖果！ERR");
                break;
            case SOLD:
                count --;
                if (count > 0) {
                    // 如果是winner = 1 则进行发放再发放一个
                    if (winner == 1) {
                        System.out.print("发放双倍糖果..");
                        winner = 0;
                        dispense();
                    } else {
                        state = NO_QUARTER;
                    }

                } else {
                    state = SOLD_OUT;
                }
                System.out.println("奖品发放完成");
                break;
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
