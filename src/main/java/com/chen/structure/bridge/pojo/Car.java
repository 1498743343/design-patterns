package com.chen.structure.bridge.pojo;

import com.chen.structure.bridge.Engine;

/**
 * 车
 * 车有很多属性，比如发动机、品牌、车轮等等，如果全都按照直接集成的话会造成子类爆炸，每一个属性下都有很多种类，这种情况下使用直接继承，类的数量会指数型的增长
 * 使用桥接模式，将发动机、品牌等和车息息相关的属性组装到一起，是他们变成车的一个属性，这样就可以避免子类数量爆炸，同时车和其他属性又可以各自拓展
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * 开车
     */
    public abstract void drive();
}
