package com.chen.create.factory.bean;

/**
 * 马
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class Horse implements Animal {
    @Override
    public void eat() {
        System.out.println("horse eat");
    }
}
