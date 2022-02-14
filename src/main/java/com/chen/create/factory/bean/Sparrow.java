package com.chen.create.factory.bean;

/**
 * 麻雀
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class Sparrow implements Bird {
    @Override
    public void eat() {
        System.out.println("sparrow eat");
    }

    @Override
    public void fly() {
        System.out.println("sparrow fly");
    }
}
