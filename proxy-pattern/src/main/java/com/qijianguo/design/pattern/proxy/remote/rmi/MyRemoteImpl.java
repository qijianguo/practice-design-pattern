package com.qijianguo.design.pattern.proxy.remote.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 让 {@link UnicastRemoteObject} 处理远程功能
 * @author qijianguo
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /**
     * {@link UnicastRemoteObject} 的构造器抛出了RemoteException，
     * 当实例化当前类的时候，父类 UnicastRemoteObject 的构造方法也就能够同时被调用了
     * @throws RemoteException
     */
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return null;
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            // 使用RMI Registry注册此服务
            Naming.bind("MyRemote", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
