package com.chen.create.factory.bean;

/**
 * 鲫鱼
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class Crucian implements Fish{
    @Override
    public void eat() {
        System.out.println("crucian eat");
    }

    @Override
    public void swim() {
        System.out.println("crucian swim");
    }
}
