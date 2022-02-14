package com.chen.structure.decorator;

/**
 * 装饰器模式 main<br>
 * 装饰器模式主要是解决了动态给原型追加逻辑的问题(注意是动态)。如果我们需要在原业务的基础上, 加一部分逻辑, 在不改动原代码的情况下可以考虑使用装饰器模式。
 * 示例代码如下, 虽然最后已经不是原来的 shape, 但是我们装饰的过程中将原 shape 的逻辑保存了下来, 我们可以无限制的动态增加逻辑
 *
 * @author chenzihan
 * @date 2021/12/02
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape = new RedShapeDecorator(shape);
        shape = new BlueShapeDecorator(shape);
        shape.draw();
    }
}
