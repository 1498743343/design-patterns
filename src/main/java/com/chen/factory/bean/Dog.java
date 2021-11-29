package com.chen.factory.bean;

/**
 * 狗
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
