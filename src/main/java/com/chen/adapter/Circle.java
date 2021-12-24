package com.chen.adapter;

/**
 * 圆
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Circle implements Shape {
    @Override
    public void draw(String paper) {
        System.out.println("在" + paper + "上画圆");
    }
}
