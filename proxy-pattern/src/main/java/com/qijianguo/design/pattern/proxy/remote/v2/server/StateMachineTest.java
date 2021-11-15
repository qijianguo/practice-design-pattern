package com.qijianguo.design.pattern.proxy.remote.v2.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * 只能是本地监控
 * @author qijianguo
 */
public class StateMachineTest {

    public static void main(String[] args) {
        String location = "abc";
        int count = 1;
        try {
            StateMachine sm = new StateMachine(location, count);
            //StateMonitor stateMonitor = new StateMonitor(sm);
            // 调用report方法就可以打印当前的状态了...(这里只是本地监控，即监控代码和业务代码在同一个JVM中)
            // stateMonitor.report();
            Naming.bind("//" + location + "/stateMachine", sm);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }
}
