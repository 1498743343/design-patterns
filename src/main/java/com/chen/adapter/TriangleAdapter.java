package com.chen.adapter;

/**
 * 三角形适配器: 在适配器中做格式转换, 这样就可以将已有的三角形的 darw 方法适配到已有的 shape 接口中
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class TriangleAdapter implements Shape{
    private Triangle triangle;
    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }
    @Override
    public void draw(String paper) {
        triangle.draw("黑色", paper);
    }
}
