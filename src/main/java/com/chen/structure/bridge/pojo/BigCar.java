package com.chen.structure.bridge.pojo;

import com.chen.structure.bridge.Engine;

/**
 * 大型汽车
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class BigCar extends Car {
    public BigCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("drive big car");
    }
}
