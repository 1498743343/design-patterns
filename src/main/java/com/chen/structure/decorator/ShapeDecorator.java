package com.chen.structure.decorator;

/**
 * 形状装饰器<br>
 * 这里的举例是透明式, 有时我们需要给原型 shape 添加一些他没有的功能, 比如我想让圆形变身成为轮胎, 这就需要在装饰其中新增方法,  我们称这种为"半透明式", 后面会进行举例
 *
 * @author chenzihan
 * @date 2021/12/02
 */
public class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
