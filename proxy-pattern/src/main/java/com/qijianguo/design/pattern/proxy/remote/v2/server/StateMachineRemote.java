package com.qijianguo.design.pattern.proxy.remote.v2.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 * 注意：返回值必须是可序列化的
 * @author qijianguo
 */
public interface StateMachineRemote extends Remote {

    int getCount() throws RemoteException;

    State getState() throws RemoteException;

    /**
     * 1.传输对象必须是原语或是可序列化的 `State extends Serializable`
     * 2.每个State中都维护这一个StateMachine对象的引用，不需要将整个糖果机的被序列化后传输，`transient StateMachine`
     * @return
     */
    String getLocation() throws RemoteException;

}
