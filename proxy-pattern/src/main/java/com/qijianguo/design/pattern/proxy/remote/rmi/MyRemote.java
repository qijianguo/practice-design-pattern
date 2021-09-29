package com.qijianguo.design.pattern.proxy.remote.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * RMI {@link Remote} 只是一个“记号”接口，用来标识是远程方法调用，不含任何方法
 *
 * @author qijianguo
 */
public interface MyRemote extends Remote {

    /**
     * @return 返回值属于 原语（Primitive）类型 或 可序列化（Serializable）类型
     * @throws RemoteException 由于是远程调用，就涉及到网络和I/O，每个方法中声明此异常是为了让客户端明确此方法有可能遇到的问题
     */
    String sayHello() throws RemoteException ;
}
