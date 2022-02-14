package com.chen.structure.decorator;

/**
 * 给形状上红色
 *
 * @author chenzihan
 * @date 2021/12/02
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw() {
        shape.draw();
        System.out.println("给" + shape.getClass().getName() + "加一点红色");
    }
}
