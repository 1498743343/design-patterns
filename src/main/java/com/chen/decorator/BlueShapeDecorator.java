package com.chen.decorator;

/**
 * 给形状上蓝色
 *
 * @author chenzihan
 * @date 2021/12/02
 */
public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw() {
        shape.draw();
        System.out.println("给" + shape.getClass().getName() + "加一点蓝色");
    }
}
