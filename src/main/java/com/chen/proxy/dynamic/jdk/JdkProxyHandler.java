package com.chen.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理处理程序
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class JdkProxyHandler implements InvocationHandler {
    /**
     * 需要被代理的类对象
     */
    private Object object;

    public Object getInstance(Object object) {
        this.object = object;
        Class<?> clazz = object.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    /**
     * 调用
     *
     * @param proxy  代理
     * @param method 方法
     * @param args   arg游戏
     * @return {@link Object} 如果无特殊需求, 直接返回调用方法的返回值即可, method.invoke 的返回值就是调用方法的返回值
     * @throws Throwable throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("user = " + args[0]);
        return method.invoke(this.object, args);
    }
}
