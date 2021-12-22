package com.chen.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理拦截器
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class CglibProxyInterceptor implements MethodInterceptor {
    /**
     * 需要代理的类的对象
     */
    private Object target;

    public Object getInstance(Object targetObject) {
        target = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("info: " + objects[0]);
        return method.invoke(target, objects);
    }
}
