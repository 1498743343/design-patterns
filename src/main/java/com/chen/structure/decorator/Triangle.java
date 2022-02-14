package com.chen.structure.decorator;

/**
 * 三角形
 *
 * @author chenzihan
 * @date 2021/12/02
 */
public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画三角");
    }
}
