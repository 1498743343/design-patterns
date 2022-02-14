package com.chen.structure.decorator;

/**
 * 圆
 *
 * @author chenzihan
 * @date 2021/12/02
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
