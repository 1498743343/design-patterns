package com.chen.structure.bridge.pojo;

import com.chen.structure.bridge.Engine;

/**
 * 微型汽车
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class TinyCar extends Car{

    public TinyCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("drive tiny car");
    }
}
