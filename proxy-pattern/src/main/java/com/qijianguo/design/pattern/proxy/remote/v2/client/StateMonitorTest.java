package com.qijianguo.design.pattern.proxy.remote.v2.client;

import com.qijianguo.design.pattern.proxy.remote.v2.server.StateMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author qijianguo
 */
public class StateMonitorTest {

    public static void main(String[] args) {
        try {
            StateMachineRemote remote = (StateMachineRemote) Naming.lookup("rmi://127.0.0.1/stateMachine");
            StateMonitor monitor = new StateMonitor(remote);
            monitor.report();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException remoteException) {
            remoteException.printStackTrace();
        }

    }
}
