package com.qijianguo.design.pattern.proxy.dynamic.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 负责修改自己信息的代码类
 * @author qijianguo
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 只处理关心的方法
        if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException("方法：" + method.getName() + " 无操作权限");
        }
        return method.invoke(personBean, args);
    }
}
