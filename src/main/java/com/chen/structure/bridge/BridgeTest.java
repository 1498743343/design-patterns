package com.chen.structure.bridge;

import com.chen.structure.bridge.pojo.BigCar;
import com.chen.structure.bridge.pojo.FuelEngine;

/**
 * 桥接模式：用于把抽象化与实现化解耦，使得二者可以独立变化
 * 说人话就是避免直接继承带来的子类爆炸
 *
 * @author chenzihan
 */
public class BridgeTest {
    public static void main(String[] args) {
        FuelEngine fuelEngine = new FuelEngine();
        BigCar bigCar = new BigCar(fuelEngine);
        bigCar.drive();
    }
}
