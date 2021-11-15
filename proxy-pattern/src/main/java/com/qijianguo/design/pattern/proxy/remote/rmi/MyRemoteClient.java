package com.qijianguo.design.pattern.proxy.remote.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 客户端
 * @author qijianguo
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        try {
            MyRemote myRemote = (MyRemote)Naming.lookup("rmi://127.0.0.1/MyRemote");
            myRemote.sayHello();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

