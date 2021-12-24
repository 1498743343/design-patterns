package com.chen.adapter;

/**
 * 方形
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Square implements Shape{
    @Override
    public void draw(String paper) {
        System.out.println("在" + "上画方形");
    }
}
