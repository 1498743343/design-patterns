package com.chen.factory.bean;

/**
 * 啄木鸟
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class Woodpecker implements Bird {
    @Override
    public void eat() {
        System.out.println("woodpecker eat");
    }

    @Override
    public void fly() {
        System.out.println("woodpecker eat");
    }
}
