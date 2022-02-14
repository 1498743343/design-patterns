package com.chen.create.factory.statics;

import com.chen.create.factory.bean.Animal;
import com.chen.create.factory.bean.Carp;

/**
 * 鲤鱼的工厂
 *
 * @author chenzihan
 * @date 2021/11/25
 */
public class CarpFactory implements StaticsFactory {
    @Override
    public Animal getAnimal() {
        return new Carp();
    }
}
