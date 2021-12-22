package com.chen.proxy.dynamic.cglib;

import com.chen.proxy.dynamic.User;

/**
 * 动态代理模式: cglib代理, 利用 ASM 开源包，加载代理对象类的 class 文件，通过修改其字节码生成子类来处理, 所以我们在使用 cglib 代理时,
 * 不可以使用 final 修饰方法, 因为 final 修饰的方法不可以被重写
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class CglibMain {
    public static void main(String[] args) {
        CglibProxyInterceptor proxyInterceptor = new CglibProxyInterceptor();
        UserService service = (UserService)proxyInterceptor.getInstance(new UserService());
        User user = new User("czh", 25);
        int add = service.add(user);
        System.out.println("add result = " + add);
        service.delete("czh");
    }
}
