package com.qijianguo.design.pattern.state.v2;

public class StateMachineTest {

    public static void main(String[] args) {
        StateMachine sm = new StateMachine(5,1);
        sm.insertQuarter();
//        sm.ejectQuarter();
        sm.turnCrank();


        sm.insertQuarter();
//        sm.ejectQuarter();
        sm.turnCrank();



        sm.insertQuarter();
//        sm.ejectQuarter();
        sm.turnCrank();



        sm.insertQuarter();
//        sm.ejectQuarter();
        sm.turnCrank();



        sm.insertQuarter();
//        sm.ejectQuarter();
        sm.turnCrank();



        sm.insertQuarter();
//        sm.ejectQuarter();
        sm.turnCrank();
    }
}
