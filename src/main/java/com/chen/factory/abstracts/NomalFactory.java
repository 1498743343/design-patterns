package com.chen.factory.abstracts;

import com.chen.factory.bean.Bird;
import com.chen.factory.bean.Carp;
import com.chen.factory.bean.Fish;
import com.chen.factory.bean.Sparrow;

/**
 * 常见鱼和鸟的工厂
 *
 * @author chenzihan
 * @date 2021/11/25
 */
public class NomalFactory implements AnimalFactory {
    @Override
    public Bird createBird(String name) {
        return new Sparrow();
    }

    @Override
    public Fish createFish(String name) {
        return new Carp();
    }
}
