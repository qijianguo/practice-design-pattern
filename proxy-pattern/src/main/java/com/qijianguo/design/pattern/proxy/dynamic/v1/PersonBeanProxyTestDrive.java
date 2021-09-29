package com.qijianguo.design.pattern.proxy.dynamic.v1;

import java.lang.reflect.Proxy;

public class PersonBeanProxyTestDrive {

    public static void main(String[] args) {
        // 获取用户信息
        PersonBean personBean = getDefaultPersonBean();

        /* --------------- */

        // 构建代理对象
        PersonBean ownerProxy = getOwnerProxy(personBean);
        // 修改姓名
        try {
            ownerProxy.setName("aaa");
            ownerProxy.setHotOrNotRating(123);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ownerProxy);


        PersonBean nonOwnerProxy = getNonOwnerProxy(personBean);
        // 测试能否改别人的兴趣爱好，期望 IllegalAccessException
        try {
            nonOwnerProxy.setInterests("Basketball");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nonOwnerProxy);
    }

    public static PersonBean getDefaultPersonBean() {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("zs");
        personBean.setGender("Male");
        personBean.setHotOrNotRating(10);
        personBean.setInterests("PINGPONG");
        return personBean;
    }

    public static PersonBean getOwnerProxy(PersonBean personBean) {
            return  (PersonBean) Proxy.newProxyInstance(
                    personBean.getClass().getClassLoader(),
                    personBean.getClass().getInterfaces(),
                    new OwnerInvocationHandler(personBean));
    }


    public static PersonBean getNonOwnerProxy(PersonBean personBean) {
        return  (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
