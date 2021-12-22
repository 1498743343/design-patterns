package com.chen.proxy.statics;

/**
 * 需要代理的类不一定需要实现一个接口. 主要的功能就是让客户端不访问原来的对象即可完成功能, 同时追加一些和原来的功能关联不大的功能。
 * 这里需要注意和装饰器模式的区别, 装饰器模式是对原业务功能的增强, 代理模式虽然也是增加一些功能, 但是和原业务功能关联不大
 * 静态代理模式 main: 静态代理区别于动态代理, 在编译阶段就已经确定了代理类和功能
 * @author chenzihan
 * @date 2021/12/22
 */
public class LandlordMain {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        LandlordProxy landlordProxy = new LandlordProxy();
        landlordProxy.setLandlord(landlord);
        landlordProxy.rent();
    }
}
