package com.chen.structure.adapter;

/**
 * 适配器模式: 将一个类的接口转换成客户希望的另外一个接口。Adapter 模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class AdapterMain {
    public static void main(String[] args) {
        Shape triangle = new TriangleAdapter(new Triangle());
        triangle.draw("电脑");
    }
}
