package com.chen.factory.abstracts;

import com.chen.factory.bean.*;

/**
 * 动物工厂<br>
 * 抽象工厂模式可以生产统一族中的不同类的对象：鱼和鸟同属动物，但是不是同类
 *
 * @author chenzihan
 * @date 2021/11/25
 */
public interface AnimalFactory {
    /**
     * 创建鸟
     *
     * @param name 鸟的名字
     * @return {@link Bird}
     */
    Bird createBird(String name);

    /**
     * 创建鱼
     *
     * @param name 鱼的名字
     * @return {@link Fish}
     */
    Fish createFish(String name);
}
