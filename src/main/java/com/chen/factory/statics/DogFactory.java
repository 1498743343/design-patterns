package com.chen.factory.statics;

import com.chen.factory.bean.Animal;
import com.chen.factory.bean.Dog;

/**
 * 狗的工厂
 *
 * @author chenzihan
 * @date 2021/11/25
 */
public class DogFactory implements StaticsFactory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
