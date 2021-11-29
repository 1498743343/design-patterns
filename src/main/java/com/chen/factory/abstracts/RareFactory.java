package com.chen.factory.abstracts;

import com.chen.factory.bean.Bird;
import com.chen.factory.bean.Crucian;
import com.chen.factory.bean.Fish;
import com.chen.factory.bean.Woodpecker;

/**
 * 罕见鱼和鸟的工厂
 *
 * @author chenzihan
 * @date 2021/11/25
 */
public class RareFactory implements AnimalFactory {
    @Override
    public Bird createBird(String name) {
        return new Woodpecker();
    }

    @Override
    public Fish createFish(String name) {
        return new Crucian();
    }
}
