package com.chen.create.factory.abstracts;

import com.chen.create.factory.bean.Bird;
import com.chen.create.factory.bean.Carp;
import com.chen.create.factory.bean.Fish;
import com.chen.create.factory.bean.Sparrow;

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
