package com.qijianguo.design.pattern.state.v1;

public class StateMachineTest {

    public static void main(String[] args) {
        StateMachine sm = new StateMachine(5);
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
