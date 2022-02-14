package com.chen.structure.proxy.dynamic.jdk;

import com.chen.structure.proxy.dynamic.User;

/**
 * 动态代理模式: jdk代理, 需要代理的类必须要实现一个或多个接口, 这是由于 Proxy.newProxyInstance 的入参决定的
 * 在jdk1.8以后, jdk代理的效率已经优于 cglib, 但是由于必须实现接口的限制, 它的适用性比 cglib 要差一些
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class JdkMain {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        JdkProxyHandler jdkProxyHandler = new JdkProxyHandler();
        UserService userServiceProxy = (UserService) jdkProxyHandler.getInstance(userService);
        User user = User.builder()
                .name("czh")
                .age(25)
                .build();
        int result = userServiceProxy.add(user);
        System.out.println("result = " + result);
    }
}
