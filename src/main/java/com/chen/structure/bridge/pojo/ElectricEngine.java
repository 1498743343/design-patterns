package com.chen.structure.bridge.pojo;

import com.chen.structure.bridge.Engine;

/**
 * 电力发动机
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("start electric engine");
    }
}
