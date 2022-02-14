package com.chen.structure.bridge.pojo;

import com.chen.structure.bridge.Engine;

/**
 * 燃料发动机
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class FuelEngine implements Engine {
    @Override
    public void start() {
        System.out.println("start fuel engine");
    }
}
