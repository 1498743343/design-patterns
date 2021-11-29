package com.chen.factory.bean;

/**
 * 鲤鱼
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class Carp implements Fish{
    @Override
    public void eat() {
        System.out.println("carp eat");
    }

    @Override
    public void swim() {
        System.out.println("carp swim");
    }
}
